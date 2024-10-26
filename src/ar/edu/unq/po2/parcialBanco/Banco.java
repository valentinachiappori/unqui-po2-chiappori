package ar.edu.unq.po2.parcialBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nombre;
	private String direccion;
	private int cuit;
	private List<CajaDeAhorro> cajas;
	
	public Banco (String nombre, String direccion, int cuit) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.cuit = cuit;
		this.cajas = new ArrayList<CajaDeAhorro>();
	}
	
	public Double estadoFinanciero() {
		return cajas.stream().mapToDouble(caja -> caja.getSaldo()).sum();
	}
}
