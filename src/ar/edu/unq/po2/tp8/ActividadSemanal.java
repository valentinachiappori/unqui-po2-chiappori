package ar.edu.unq.po2.tp8;

public class ActividadSemanal {

	private DiaDeLaSemana dia;
	private Double horaInicio;
	private Double duracion;
	private Deporte deporte;
	
	public ActividadSemanal (DiaDeLaSemana dia, Double horaInicio, Double duracion, Deporte deporte) {
		this.setDia(dia);
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.setDeporte(deporte);
		
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}

	public Double getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Double horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public Double calcularCosto() {
        float costoPorHora;

        // Costo base por hora dependiendo del día
        switch (dia) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
                costoPorHora = 500;
                break;
            default:
                costoPorHora = 1000;
                break;
        }

        // Costo adicional por la complejidad del deporte
        Double costoComplejidad = deporte.getComplejidad() * 200d;

        // Cálculo total: costo por hora + costo de complejidad, multiplicado por la duración
        return (costoPorHora + costoComplejidad) * duracion;
    }
	
	@Override
	public String toString() {
	    return "Deporte " + this.deporte + ". Dia: " + this.dia + " A LAS: " + this.horaInicio + ". Duración: " + this.duracion + ".";
	}
	
}
