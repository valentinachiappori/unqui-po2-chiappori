package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{
	
	private Double costoUnidad;
	private Double costoUnidades;
	
	public Servicio(Double costoUnidad, Double costoUnidades) {
		super();
		this.costoUnidad = costoUnidad;
		this.costoUnidades = costoUnidades;
	}

	@Override
	public double calcularMonto() {
		return costoUnidad * costoUnidades;
	}
}
