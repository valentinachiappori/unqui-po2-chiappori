package ar.edu.unq.po2.tp10;

public class EstadoSeleccion implements EstadoReproductor{

	@Override
	public void play(ReproductorMP3 reproductor) {
		reproductor.setEstado(new EstadoReproduccion());
		reproductor.getCancion().play();
	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		 System.out.println("Error: No hay ninguna canción reproduciéndose.");
	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		 System.out.println("Error: No hay ninguna canción reproduciéndose.");
	}

}
