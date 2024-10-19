package ar.edu.unq.po2.tp6;

public class EmpleadoTemporario extends Empleado {
	
	private int horas;
	private Boolean tieneHijos;
	private Boolean estaCasado;
	
	public EmpleadoTemporario(int horas, Boolean tieneHijos, Boolean estaCasado) {
		this.horas = horas;
		this.tieneHijos = tieneHijos;
		this.estaCasado = estaCasado;
	}

	public Double sueldoBasico() {
		return 1000d;
	}
	
	public Double sueldoBruto() {
		Double result = this.sueldoBasico() + (5 * horas);
		if (tieneHijos || estaCasado) {
			result += 100;
		}
		return result;
	}
}
