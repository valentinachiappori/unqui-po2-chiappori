package ar.edu.unq.po2.tp5;

public abstract class Producto {
	
	protected String name;
	protected Double precio;
	
	public Producto(String name, Double precio) {
		this.name = name;
		this.precio = precio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
}
