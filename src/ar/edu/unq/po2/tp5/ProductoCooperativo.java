package ar.edu.unq.po2.tp5;

public class ProductoCooperativo extends Producto {

	public ProductoCooperativo(String name, Double precio, int stock) {
		super(name, precio, stock);
	}

	@Override
	public double calcularMonto() {
		return (this.precio * 0.9d);
	}
	
}
