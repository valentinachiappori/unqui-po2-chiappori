package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClubTest {

	private Club clubDeBarrio;
	private ActividadSemanal futbolMartes;
	private ActividadSemanal futbolMiercoles;
	private ActividadSemanal basketMiercoles;
	private ActividadSemanal tennisLunes;
	
	@BeforeEach
	void setUp(){
		
		clubDeBarrio = new Club();
		
		tennisLunes = new ActividadSemanal (DiaDeLaSemana.LUNES, 11d, 100d, Deporte.TENNIS);
		futbolMiercoles = new ActividadSemanal (DiaDeLaSemana.MIERCOLES, 16d, 100d, Deporte.FUTBOL);
		basketMiercoles = new ActividadSemanal (DiaDeLaSemana.MIERCOLES, 11d, 100d, Deporte.BASKET);
		futbolMartes = new ActividadSemanal (DiaDeLaSemana.MARTES, 10d, 120d, Deporte.FUTBOL);
		
		clubDeBarrio.agregarActividad(futbolMartes);
		clubDeBarrio.agregarActividad(basketMiercoles);
		clubDeBarrio.agregarActividad(futbolMiercoles);
		clubDeBarrio.agregarActividad(tennisLunes);
	}

	@Test
	void testTodasLasDeFutbol() {
		List<ActividadSemanal> futbols = clubDeBarrio.todasLasDeFutbol();
		
		// Verificar que el tamaño de la lista sea 3
        assertEquals(2, futbols.size());

        // Verificar que la lista contenga las actividades
        assertTrue(futbols.contains(futbolMartes));
        assertTrue(futbols.contains(futbolMiercoles));
        
     // Verificar que la lista no contenga las actividades erroneas
        assertFalse(futbols.contains(tennisLunes));
        assertFalse(futbols.contains(basketMiercoles));
	}
	
	@Test
	void testTodasLasDeComplejidad() {
		List<ActividadSemanal> complejidad2 = clubDeBarrio.todasLasDeComplejidad(2);
		
		// Verificar que el tamaño de la lista sea 3
        assertEquals(3, complejidad2.size());

        // Verificar que la lista contenga las actividades
        assertTrue(complejidad2.contains(basketMiercoles));
        assertTrue(complejidad2.contains(futbolMartes));
        assertTrue(complejidad2.contains(futbolMiercoles));
        
     // Verificar que la lista no contenga las actividades erroneas
        assertFalse(complejidad2.contains(tennisLunes));
	}
	
	@Test
	void testCantHoras() {
		Double total = clubDeBarrio.cantHorasTotales();
		
		assertEquals(420d, total);
	}
	
	@Test
	void testLaDeMenorCostoDeDeporte() {
		ActividadSemanal actividad = clubDeBarrio.laDeMenorCostoDeDeporte(Deporte.FUTBOL);
		
		assertEquals(actividad, futbolMiercoles);
	}
	
	@Test
	void testToString() {
		String texto = futbolMartes.toString();
		
		assertEquals(texto,"Deporte FUTBOL. Dia: MARTES A LAS: 10.0. Duración: 120.0.");
	}
	
	@Test
	void testTodaLaInfo() {
	    String textoResultado = clubDeBarrio.infoTodasLasActividades();
	    String textoEsperado = "Deporte FUTBOL. Dia: MARTES A LAS: 10.0. Duración: 120.0.\n" +
	                           "Deporte BASKET. Dia: MIERCOLES A LAS: 11.0. Duración: 100.0.\n" +
	                           "Deporte FUTBOL. Dia: MIERCOLES A LAS: 16.0. Duración: 100.0.\n" +
	                           "Deporte TENNIS. Dia: LUNES A LAS: 11.0. Duración: 100.0.";

	    assertEquals(textoEsperado, textoResultado);
	}
}
