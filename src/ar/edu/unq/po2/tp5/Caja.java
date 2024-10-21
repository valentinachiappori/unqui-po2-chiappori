package ar.edu.unq.po2.tp5;

import java.util.List;
import java.util.ArrayList;

public class Caja {
	
	private List<Pagable> itemsRegistrados;

	public Caja() {
		this.itemsRegistrados = new ArrayList<Pagable>();
	}

	public double cobrar() {
		double monto = 0;
		for (Pagable pagable : itemsRegistrados) {
			monto += pagable.calcularMonto();
		}
		return monto;
	}
	
	public void registrar(Pagable pagable) {
		itemsRegistrados.add(pagable);
	}
}

