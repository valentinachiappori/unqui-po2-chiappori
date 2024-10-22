package ar.edu.unq.po2.tp8;

import java.util.Comparator;

public enum LesionDermatologica {
	
	ROJO("Lesion maxima", 3),
	GRIS("Lesion cicatrizando", 2), 
	AMARILLO("Lesion media", 1),
	MIEL("Lesion minima", 0);

	private String descripcion;
	private int nivelDeRiesgo;
	
	private LesionDermatologica(String descripcion, int nivelDeRiesgo) {
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public LesionDermatologica getProximoColor() {
		return values()[(this.ordinal() + 1) % values().length];
	}
	
	//getProximoColor: return values()[(this.ordinal() + 1) % values().length];      ----OTRA VERSION, SERA?
	
	@Override
    public String toString() {
        return this.name() + " (Descripcion: " + descripcion + ", Nivel de riesgo: " + nivelDeRiesgo + 
          " y Proximo color: " + getProximoColor().name() + ")";
    }
	
	public static Comparator<LesionDermatologica> comparadorPorRiesgo() {
	    return Comparator.comparingInt(LesionDermatologica::getNivelDeRiesgo);
	}
	
	//Comparator<LesionDermatologica> comparadorPorRiesgo = (l1, l2) -> 
    //Integer.compare(l1.getNivelDeRiesgo(), l2.getNivelDeRiesgo());

}
