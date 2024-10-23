package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {
	
	private Carta c1;
	private Carta c2;
	private Carta c3;

	
	@BeforeEach
	void setUp()  {
		c1 = new Carta("4","D");
		c2 = new Carta("A","P");
		c3 = new Carta("5","D");
	}

	@Test
	void testValor() {
		assertEquals("4",c1.getValor());
	}
	
	@Test
	void testPalo() {
		assertEquals("D",c1.getPalo());
	}
	
	@Test //verifica true
	void testSuperiorA() {
		assertTrue(c2.esSuperiorA(c1));
	}
	
	@Test //verifica false
	void testSuperiorA2() {
		assertFalse(c1.esSuperiorA(c2));
	}
	
	@Test
	void testSonDePalo() {
		assertTrue(c1.esDeMismoPalo(c3));
	}
	
	@Test
	void testSonDePalo2() {
		assertFalse(c1.esDeMismoPalo(c2));
	}
}
