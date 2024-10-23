package ar.edu.unq.po2.tp10;

public class EstadoInicial implements EstadoJuego {

	@Override
	public void iniciarJuego(MaquinaJuego maquina) {
		if (maquina.getFichas() == 0) {
			maquina.mostrarMensaje();
		} else if (maquina.getFichas() == 1) { 
			maquina.setEstado(new EstadoUnJugador());
			maquina.iniciarJuego();
		} else {
			maquina.setEstado(new EstadoDosJugadores());
			maquina.iniciarJuego();
		}
	}

	@Override
	public void terminarJuego(MaquinaJuego maquina) {
		maquina.mostrarMensaje();		
	}

}
