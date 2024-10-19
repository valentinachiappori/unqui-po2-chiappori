package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer>numeros;
	
	public Counter() {
		this.numeros = new ArrayList<Integer>();
	}
	
	public void addNumber (int numero) {
		numeros.add(numero);
	}
	
	public int cantPares() {
		int pares = 0;
		for (int entero: numeros) {
			if (esPar (entero)) {
				pares =+1;
			}
		}
		return pares;
	}
	
	public boolean esPar (int entero) {
		return entero % 2 == 0;
	}
	
	public int cantImpares() {
		int impares = 0;
		for (int entero: numeros) {
			if (entero % 2 != 0) {
				impares =+1;
			}
		}
		return impares;
	}
	
	public int cantMultiplosDe(int entero2) {
		int multiplos = 0;
		for (int entero: numeros) {
			if (entero % entero2 == 0) {
				multiplos =+1;
			}
		}
		return multiplos;
		
	}
}

