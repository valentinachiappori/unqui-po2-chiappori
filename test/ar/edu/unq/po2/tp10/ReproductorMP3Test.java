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
		assertEquals(new EstadoReproduccion(),  );
	}

}
