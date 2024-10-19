package ar.edu.unq.po2.tp6;

public abstract class Empleado {
	
	public final Double sueldo() {
		return this.sueldoBruto() - this.aportesYObraSocial();
	}
	
	public abstract Double sueldoBruto();
	public abstract Double sueldoBasico();
	
	public Double aportesYObraSocial() {
		return this.sueldoBruto() * 0.13;
	}
}
