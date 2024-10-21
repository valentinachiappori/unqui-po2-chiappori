package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {

	private double montoFijo;
	
	public Impuesto (double montoFijo) {
		this.montoFijo = montoFijo;
	}
	
	@Override
	public double calcularMonto() {
		return montoFijo;
	}
	
}
