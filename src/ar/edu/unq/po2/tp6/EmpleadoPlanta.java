package ar.edu.unq.po2.tp6;

public class EmpleadoPlanta extends Empleado {

	private int cantHijos;
	
	public EmpleadoPlanta (int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	public Double sueldoBasico() {
		return 3000d;
	}
	
	public Double sueldoBruto() {
		return this.sueldoBasico() + (this.cantHijos * 150);
	}
}
