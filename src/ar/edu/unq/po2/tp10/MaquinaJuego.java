package ar.edu.unq.po2.tp10;

public class MaquinaJuego {
	
	private Integer fichas;
	private EstadoJuego estado;
	
	MaquinaJuego() {
		this.fichas = 0;
		this.estado = new EstadoInicial();
	}

	public Integer getFichas() {
		return fichas;
	}

	public void ingresarFichas(Integer fichas) {
		if (fichas >= 0 || fichas <= 2) {
			this.fichas = fichas;
		} else {
			throw new IllegalStateException("Error: Maximo de fichas alcanzado");		
		}
	}

	public EstadoJuego getEstado() {
		return estado;
	}

	public void setEstado(EstadoJuego estado) {
		this.estado = estado;
	}
	
	public void iniciarJuego() {
		estado.iniciarJuego(this);
	}
	
	public void terminarJuego() {
		estado.terminarJuego(this);
	}

	public void mostrarMensaje() {
		System.out.println("Ingrese fichas para jugar");	
	}
}
