package ar.edu.unq.po2.tp5;

public abstract class Producto implements Pagable {
	
	protected String name;
	protected Double precio;
	protected int stock;
	
	public Producto(String name, Double precio, int stock) {
		this.name = name;
		this.precio = precio;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public void decrementarStock() {
		this.stock -= 1;
	}
	
	@Override
	public double calcularMonto() {
		return precio;
	}
	
	@Override
	public void registrarPago() {
		this.calcularMonto();
		this.decrementarStock();
	}
	
	
	
}
