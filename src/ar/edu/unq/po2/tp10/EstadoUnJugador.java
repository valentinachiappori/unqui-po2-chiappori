package ar.edu.unq.po2.tp10;

public class EstadoUnJugador implements EstadoJuego {

	@Override
	public void iniciarJuego(MaquinaJuego maquina) {

	}

	@Override
	public void terminarJuego(MaquinaJuego maquina) {
		maquina.setEstado(new EstadoInicial());
	}

}