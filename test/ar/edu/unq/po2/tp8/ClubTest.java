package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClubTest {

	private Club clubDeBarrio;
	
	@BeforeEach
	void setUp(){
		
		clubDeBarrio = new Club();
		
		ActividadSemanal futbolMartes = new ActividadSemanal (DiaDeLaSemana.MARTES, 10d, 120d, Deporte.FUTBOL);
		ActividadSemanal basketMiercoles = new ActividadSemanal (DiaDeLaSemana.MIERCOLES, 11d, 100d, Deporte.BASKET);
		ActividadSemanal futbolMiercoles = new ActividadSemanal (DiaDeLaSemana.MIERCOLES, 16d, 100d, Deporte.FUTBOL);
		ActividadSemanal tennisLunes = new ActividadSemanal (DiaDeLaSemana.LUNES, 11d, 100d, Deporte.TENNIS);
		
		clubDeBarrio.agregarActividad(tennisLunes);
		clubDeBarrio.agregarActividad(futbolMartes);
		clubDeBarrio.agregarActividad(basketMiercoles);
		clubDeBarrio.agregarActividad(futbolMiercoles);
	}

	@Test
	void testTodasLasDeFutbol() {
		List<ActividadSemanal> futbols = clubDeBarrio.todasLasDeFutbol();
		
		// Crear una lista esperada con las actividades de futbol
        List<ActividadSemanal> expectedFutbols = List.of(
            new ActividadSemanal(DiaDeLaSemana.MARTES, 10d, 120d, Deporte.FUTBOL),
            new ActividadSemanal(DiaDeLaSemana.MIERCOLES, 16d, 100d, Deporte.FUTBOL)
        );

        // Verificar que las listas sean iguales
        assertTrue(futbols.containsAll(expectedFutbols));
	}
	
	@Test
	void testTodasLasDeComplejidad() {
		List<ActividadSemanal> complejidad3 = clubDeBarrio.todasLasDeComplejidad(3);
		
		// Crear una lista esperada con las actividades de futbol
        List<ActividadSemanal> expectedCompl3 = List.of(
            new ActividadSemanal(DiaDeLaSemana.LUNES, 11d, 100d, Deporte.TENNIS)
        );

        // Verificar que las listas sean iguales
        assertEquals(expectedCompl3, complejidad3);
	}
}
