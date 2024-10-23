package ar.edu.unq.po2.tp9;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class Carta {
	
	private String valor;
	private String palo;
	
	public Carta(String valor, String palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public boolean esSuperiorA(Carta c1) {
		Map<String,Integer> valores = new HashMap<>();
		
		valores.put("2", 2);
		valores.put("3", 3);
		valores.put("4", 4);
		valores.put("5", 5);
		valores.put("6", 6);
		valores.put("7", 7);
		valores.put("8", 8);
		valores.put("9", 9);
		valores.put("10",10);
		valores.put("J", 11);
		valores.put("Q", 12);
		valores.put("K", 13);
		valores.put("A", 14);

		
		return valores.get(this.getValor()) >  valores.get(c1.getValor());
	}

	public boolean esDeMismoPalo(Carta c2) {
		return this.getPalo() == c2.getPalo();
	}
	
	
}
