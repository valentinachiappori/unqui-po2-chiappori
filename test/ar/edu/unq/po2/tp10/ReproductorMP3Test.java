package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReproductorMP3Test {
	
	private ReproductorMP3 reproductor;
	private Song midnights;
	
	@BeforeEach
	void setUp() {
		midnights = new Song();
		reproductor = new ReproductorMP3(midnights);
		
	}

	@Test
	void testReproduce() {
		
		reproductor.play();
		
		assertTrue(reproductor.getEstado() instanceof EstadoReproduccion);
	}
	
	@Test
	void testPausaReproduciendo() {
		
		reproductor.play();
		reproductor.pause();
		
		assertTrue(reproductor.getEstado() instanceof EstadoPausado);
	}
	
	@Test
	void testStopReproduccion() {
		
		reproductor.play();
		reproductor.stop();
		
		assertTrue(reproductor.getEstado() instanceof EstadoSeleccion);
	}
	
	@Test
    void testPlayWhenAlreadyPlayingThrowsException() {
        // Primero cambiamos el estado a "reproduciendo"
        reproductor.play();

        // Ahora intentamos hacer play nuevamente, lo que debería lanzar una excepción
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            reproductor.play();
        });

        // Verificamos el mensaje de error si es relevante
        assertEquals("Error: La canción ya se está reproduciendo.", exception.getMessage());
    }
}

