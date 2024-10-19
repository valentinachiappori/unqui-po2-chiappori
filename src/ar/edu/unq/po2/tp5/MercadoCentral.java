package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class MercadoCentral {
	
	private String nombre;
	private List<Producto>productosStock;
	
	public MercadoCentral(String nombre) {
		this.nombre = nombre;
		this.productosStock = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getProductosStock() {
		return productosStock;
	}

	public void setProductosStock(List<Producto> productosStock) {
		this.productosStock = productosStock;
	}
	
	public void decrementarStock(Producto productoASacar) {
			this.productosStock.remove(productoASacar);
		}
}
	