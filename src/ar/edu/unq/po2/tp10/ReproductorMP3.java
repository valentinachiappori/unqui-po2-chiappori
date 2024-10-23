package ar.edu.unq.po2.tp10;

public class ReproductorMP3 {
	
	private EstadoReproductor estado;
	private Song cancion;
	
	public ReproductorMP3(Song cancion) {
		this.estado = new EstadoSeleccion();
		this.cancion = cancion;
	}
	
	public void setEstado(EstadoReproductor estado) {
		this.estado = estado;
	}
	
	public Song getCancion() {
		return cancion;
	}
	
	public EstadoReproductor getEstado() {
		return estado;
	}
	
	public void play() {
		this.estado.play(this);
	}
	
	public void pause() {
		this.estado.pause(this);
	}
	
	public void stop() {
		this.estado.stop(this);
	}
	
}
