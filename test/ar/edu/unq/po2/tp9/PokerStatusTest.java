package ar.edu.unq.po2.tp9;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;
	
	private Carta c1;
	private Carta c2;
	private Carta c3;
	private Carta c4;
	private Carta c5;
	private Carta c6;
	
	@BeforeEach
	void setUp() {
		
		pokerStatus = new PokerStatus();
		c1 = mock(Carta.class);
		c2 = mock(Carta.class);
		c3 = mock(Carta.class);
		c4 = mock(Carta.class);
		c5 = mock(Carta.class);
		c6 = mock(Carta.class);
		
		when(c1.getValor()).thenReturn("A");
		when(c2.getValor()).thenReturn("A");
		when(c3.getValor()).thenReturn("A");
		when(c4.getValor()).thenReturn("A");
		when(c5.getValor()).thenReturn("4");
		when(c6.getValor()).thenReturn("2");
		when(c1.getPalo()).thenReturn("D");
		when(c2.getPalo()).thenReturn("D");
		when(c3.getPalo()).thenReturn("D");
		when(c4.getPalo()).thenReturn("D");
		when(c5.getPalo()).thenReturn("D");
		when(c6.getPalo()).thenReturn("D");

	}

	@Test
	void testPoquer() {
		
		// Llamar al método a probar
		String resultado = pokerStatus.verificar(c5, c4, c3, c2, c1);
				
		// Afirmar el resultado esperado
		assertEquals("Poquer", resultado);
	}
	
	@Test
	void testTrio() {

		String resultado = pokerStatus.verificar(c6, c4, c5, c2, c1);
		assertEquals("Trio", resultado);
	}
	
	@Test
	void testColor() {
		//verifica hay color
		String resultado = pokerStatus.verificar(c6, c4, c5, c2, c1);
		assertEquals("Poquer", resultado);
	}
		
	@Test
	void testNada(){
		//verifica no hay nada
		when(pokerStatus.verificar(c5, c4, c3, c2, c1)).thenReturn("Nada");
	}

}
