package ar.edu.unq.po2.tp10;

public class EstadoPausado implements EstadoReproductor {

	@Override
	public void play(ReproductorMP3 reproductor) {
		reproductor.setEstado(new EstadoReproduccion());
		reproductor.getCancion().play();
	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		System.out.println("Error: La canción ya está en pausa");
	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		reproductor.getCancion().stop();
		reproductor.setEstado(new EstadoSeleccion());
	}

}
