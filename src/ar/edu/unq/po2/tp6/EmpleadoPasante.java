package ar.edu.unq.po2.tp6;

public class EmpleadoPasante extends Empleado {
	
	private int horas;
	
	public EmpleadoPasante(int horas) {
		this.horas = horas;
	}

	public Double sueldoBasico() {
		return 40d * horas; 
	}
	
	public Double sueldoBruto() {
		return this.sueldoBasico();
	}
}
