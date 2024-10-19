package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private LocalDate fechaNac;
	
	public Persona (String nombre, LocalDate fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}
	
	public static Persona crear(String nombre, LocalDate fechaNac) {
		return new Persona(nombre, fechaNac);
	}
	
	public int edad() {
		
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNac, fechaActual);

		return periodo.getYears();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate fechaNac() {
		return fechaNac;
	}
	
	public boolean menorQue(Persona persona) {
		return edad() < persona.edad();
	}
}
