package ar.edu.unq.po2.tp5;

public class EmpresaTradicional extends Producto {

	public EmpresaTradicional(String name, Double precio) {
		super(name, precio);
	}

	@Override
	public Double getPrecio() {
		return this.precio;
	}
	
}
