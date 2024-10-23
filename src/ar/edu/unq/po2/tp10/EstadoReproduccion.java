package ar.edu.unq.po2.tp10;

public class EstadoReproduccion implements EstadoReproductor{

	@Override
	public void play(ReproductorMP3 reproductor) {
		System.out.println("Error: La canción ya se está reproduciendo.");
	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		reproductor.getCancion().pause();
		reproductor.setEstado(new EstadoPausado());
	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		 reproductor.getCancion().stop();
		 reproductor.setEstado(new EstadoSeleccion());
	}

}

