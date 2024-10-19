package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	protected Double precio;
	private boolean esPrecioCuidado;
	
	public Producto (String nombre, Double precio) {
		this.nombre= nombre;
		this.precio= precio;
	}
	
	public Producto (String nombre, Double precio, boolean esPrecioCuidado ) {
		this.nombre= nombre;
		this.precio= precio;
		this.esPrecioCuidado= esPrecioCuidado;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public void aumentarPrecio(Double newPrecio) {
		this.precio += newPrecio;
	}
}
