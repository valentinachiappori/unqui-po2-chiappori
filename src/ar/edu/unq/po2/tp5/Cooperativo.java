package ar.edu.unq.po2.tp5;

public class Cooperativo extends Producto {

	public Cooperativo(String name, Double precio) {
		super(name, precio);
	}

	@Override
	public Double getPrecio() {
		return (this.precio * 0.9d);
	}
	
}
