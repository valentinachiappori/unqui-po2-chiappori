package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionDermatologicaTest {
	
	@Test
    public void testDescripcion() {
        assertEquals("Lesion maxima", LesionDermatologica.ROJO.getDescripcion());
        assertEquals("Lesion cicatrizando", LesionDermatologica.GRIS.getDescripcion());
    }

    @Test
    public void testNivelDeRiesgo() {
        assertEquals(3, LesionDermatologica.ROJO.getNivelDeRiesgo());
        assertEquals(0, LesionDermatologica.MIEL.getNivelDeRiesgo());
    }

    @Test
    public void testProximoColor() {
        assertEquals(LesionDermatologica.ROJO, LesionDermatologica.MIEL.getProximoColor()); // MIEL → AMARILLO
        assertEquals(LesionDermatologica.GRIS, LesionDermatologica.ROJO.getProximoColor()); // AMARILLO → GRIS
        assertEquals(LesionDermatologica.AMARILLO, LesionDermatologica.GRIS.getProximoColor()); // GRIS → ROJO
        assertEquals(LesionDermatologica.MIEL, LesionDermatologica.AMARILLO.getProximoColor()); // ROJO → MIEL
    }

    @Test
    public void testToString() {
    	String expectedOutput = "ROJO (Descripcion: Lesion maxima, Nivel de riesgo: 3 y Proximo color: GRIS)";
    	
    	assertEquals(expectedOutput, LesionDermatologica.ROJO.toString());
    }

    @Test
    public void testComparadorPorRiesgoDirectamente() {
        Comparator<LesionDermatologica> comparador = LesionDermatologica.comparadorPorRiesgo();
        
        // Comparar dos lesiones directamente
        assertTrue(comparador.compare(LesionDermatologica.MIEL, LesionDermatologica.ROJO) < 0, 
                   "MIEL debería tener menor riesgo que ROJO");
        assertTrue(comparador.compare(LesionDermatologica.AMARILLO, LesionDermatologica.GRIS) < 0, 
                   "AMARILLO debería tener menor riesgo que GRIS");
        assertTrue(comparador.compare(LesionDermatologica.GRIS, LesionDermatologica.ROJO) < 0, 
                   "GRIS debería tener menor riesgo que ROJO");

        // Verificar que son iguales cuando tienen el mismo nivel de riesgo
        assertEquals(0, comparador.compare(LesionDermatologica.ROJO, LesionDermatologica.ROJO), 
                     "ROJO debería tener el mismo riesgo que ROJO");
    }
}

