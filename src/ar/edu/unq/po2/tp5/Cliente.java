package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombre;
	private List<Producto>productosAComprar;
	
	public Cliente(String nombre){
		this.nombre = nombre;
		this.productosAComprar = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getProductosAComprar() {
		return productosAComprar;
	}

	public void setProductosAComprar(List<Producto> productosAComprar) {
		this.productosAComprar = productosAComprar;
	}

	public void agregarProducto(Producto producto) {
		productosAComprar.add(producto);
	}
}
