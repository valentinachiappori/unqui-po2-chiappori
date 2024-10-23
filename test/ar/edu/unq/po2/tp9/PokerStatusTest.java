package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;
	
	private String asPica;
	private String asDiamante;
	private String asCorazones;
	private String asTreboles;
	private String dosPica;
	private String tresCorazones;
	private String cuatroPica;
	private String tresPica;
	private String diezPica;
	
	@BeforeEach
	void setUp() {
		
		pokerStatus = new PokerStatus();
		asPica = "AP";
		asDiamante = "AD";
		asCorazones = "AC";
		asTreboles = "AT";
		dosPica = "2P";
		tresCorazones = "3C";
		tresPica = "3P";
		cuatroPica = "4P";
		diezPica = "10P";
	}

	@Test
	void testVerificar() {
		//verifica hay poquer
		assertEquals("Poquer",pokerStatus.verificar(asPica,asDiamante,asCorazones,asTreboles,dosPica));
		
		//verifica hay trio
		assertEquals("Trio",pokerStatus.verificar(asPica,tresCorazones,asCorazones,asTreboles,dosPica));
		
		//verifica hay color
		assertEquals("Color",pokerStatus.verificar(asPica,tresPica,cuatroPica,diezPica,dosPica));
		
		//verifica no hay nada
		assertEquals("Nada",pokerStatus.verificar(asPica,tresCorazones,cuatroPica,asTreboles,dosPica));

	}

}
