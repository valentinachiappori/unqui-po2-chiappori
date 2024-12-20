package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Club {

	private List<ActividadSemanal> actividades;
	
	public Club() {
        this.actividades = new ArrayList<ActividadSemanal>();
    }
	
	public void agregarActividad(ActividadSemanal actividad) {
		this.actividades.add(actividad);
	}
	
	public List<ActividadSemanal> todasLasDeFutbol(){
		return this.actividades.stream().filter(actividad -> actividad.getDeporte() == Deporte.FUTBOL).collect(Collectors.toList());
	}
	
	public List<ActividadSemanal> todasLasDeComplejidad(int complejidad){
		return this.actividades.stream().filter(actividad -> actividad.getDeporte().getComplejidad() == complejidad).collect(Collectors.toList());
	}
	
	public Double cantHorasTotales() {
		return this.actividades.stream().mapToDouble(actividad -> actividad.getDuracion()).sum(); //RAROOO
										//mapToDouble(ActividadSemanal::getDuracion).sum()
	}
	
	public ActividadSemanal laDeMenorCostoDeDeporte (Deporte deporte) {
		return this.actividades.stream()
		        .filter(actividad -> actividad.getDeporte().equals(deporte))  // Filtra por deporte
		        .min(Comparator.comparing(actividad -> actividad.calcularCosto()))  // Compara por costo
		        .orElse(null);
	}
	
	public String infoTodasLasActividades() {
		return this.actividades.stream().map(actividad -> actividad.toString()).collect(Collectors.joining("\n"));
	}
}
