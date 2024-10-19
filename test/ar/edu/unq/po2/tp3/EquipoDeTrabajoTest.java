package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTest {
    
	private EquipoDeTrabajo equipo;

    @BeforeEach
    public void setUp() {
    	
        equipo = new EquipoDeTrabajo("Desarrollo");

        equipo.agregarIntegrante(new Persona2("Juan", "Pérez", 28));
        equipo.agregarIntegrante(new Persona2("María", "Gómez", 35));
        equipo.agregarIntegrante(new Persona2("Pedro", "López", 22));
        equipo.agregarIntegrante(new Persona2("Ana", "Martínez", 30));
        equipo.agregarIntegrante(new Persona2("Luis", "Fernández", 40));
    }

    @Test
    public void testPromedioEdadIntegrantes() {

        // Obtener el promedio de edad del equipo
        int resultado = equipo.promedioEdadIntegrantes();

        // Verificar que el resultado sea el esperado
        assertEquals(resultado, 31); 

        // Imprimir el resultado
        System.out.println("Promedio de edad de los integrantes del equipo " + equipo.getNombre() + ": " + resultado);
    }
}

