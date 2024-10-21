package ar.edu.unq.po2.tp5;

public abstract class Factura implements Pagable {
	
	private Agencia agencia;
	protected String descripcion;
	protected Double monto;
	
	public Factura () {
		
	}
	
	public Factura (String descripcion, Double monto) {
		this.descripcion = descripcion;
		this.monto = monto;
	}
	
	public abstract double calcularMonto();
	
	@Override
	public void registrarPago() {
        this.agencia.registrarPago(this);  // Notifica a la agencia el pago de la factura
	}

}
