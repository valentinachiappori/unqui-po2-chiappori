package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private String nombre;
	private List<Ingreso> ingresos;
	
	public Trabajador(String nombre) {
		this.nombre = nombre;
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	public void agregarIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
    }
	
	public Double getTotalPercibido() {
		Double total = 0d;
		for (Ingreso ingreso : ingresos) {
			total += ingreso.getMonto();
		}
		return total;
	}
	
	public Double getMontoImponible() {
		Double total = 0d;
		for (Ingreso ingreso : ingresos) {
			total += ingreso.getMontoImponible();
		}
		return total;
	}
	
	public Double getImpuestoAPagar() {
		return getMontoImponible() * 0.02;
	}
	
}
