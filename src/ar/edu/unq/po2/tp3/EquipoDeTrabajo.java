package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {

	private String nombre;
	private List<Persona2>integrantes;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<Persona2>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarIntegrante(Persona2 integrante) {
		this.integrantes.add(integrante);
	}
	
	public int promedioEdadIntegrantes() {
		if (integrantes.isEmpty()) {
	        return 0; // Evitar división por 0
	    }
		int totalEdades = 0;
		for (Persona2 persona: integrantes) {
			totalEdades += persona.getEdad();
		}
		return totalEdades / integrantes.size();
	}
	
	
}
