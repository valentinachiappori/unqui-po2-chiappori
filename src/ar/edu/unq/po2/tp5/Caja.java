package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	
	private MercadoCentral mercado;
	
	public Caja(MercadoCentral mercado) {
		this.mercado = mercado;
	}
	
	public MercadoCentral getMercadoCentral() {
		return mercado;
	}


	public void setMercadoCentral(MercadoCentral mercado) {
		this.mercado = mercado;
	}


	public Double registrarProductos(List<Producto>productos) {
		Double precioTotal = 0d;
		for (Producto producto : productos) {
			precioTotal += producto.getPrecio();
			this.mercado.decrementarStock(producto);
		}
		return precioTotal;
	}
}
