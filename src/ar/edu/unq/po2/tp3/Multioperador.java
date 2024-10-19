package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	
	private List<Integer>enteros;
	
	public Multioperador() {
		this.enteros = new ArrayList<Integer>();
	}
	
	public int sumarTodos() {  //el for no arranca si la lista está vacia, por lo que no hace falta chequear si esta vacia antes
		int total = 0; 
			for (int entero: enteros) {
				total += entero;
			}
		return total;
	}
	
	public int restarTodos() {
		int resultado = enteros.get(0);
		if (!enteros.isEmpty()) {
		    for (int i = 1; i < enteros.size(); i++) {
		        resultado -= enteros.get(i);
		    }
		}
		return resultado;
	}
	
	public int multiplicarTodos() {
		int producto = 1; //uso el neutro de la multiplicacion
		if (!enteros.isEmpty()) {
			return 0;     //devuelve 0 si la lista esta vacia
		}
		for (int entero: enteros) {
				producto *= entero;
		}
		return producto;
	}
}
