package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto newProducto) {
		productos.add(newProducto);
	}
	
	public Double getPrecioTotal() {
		Double total = 0d;
		for (int i=0; i< productos.size(); i++) {
			total += productos.get(i).getPrecio();
		}
		return total;
	}
}
