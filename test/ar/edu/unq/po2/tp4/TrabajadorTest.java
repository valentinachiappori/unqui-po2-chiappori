package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	private Trabajador lorena;
	
	@BeforeEach
	public void setUp() {
		
		Ingreso ingresoSalarioEnero = new Ingreso("Enero", "concepto", 2000d);
	    Ingreso ingresoHorasExtrasFebrero = new IngresoHorasExtras("Febrero", "concepto",500d, 20);
	    Ingreso ingresoSalarioMarzo = new Ingreso("Marzo", "concepto", 2000d);
	    
		lorena = new Trabajador("Lorena");
		
		lorena.agregarIngreso(ingresoSalarioEnero);
		lorena.agregarIngreso(ingresoHorasExtrasFebrero);
		lorena.agregarIngreso(ingresoSalarioMarzo);
		
	}
	
	@Test
	public void testCalcularTotalPercibidio() {
		assertEquals(4500d, lorena.getTotalPercibido());
	}
	
	@Test
	public void testCalcularMontoImponible() {
		assertEquals(4000d, lorena.getMontoImponible());
	}
	
	@Test
	public void testCalcularImpuestoAPagar() {
		assertEquals(80d, lorena.getImpuestoAPagar());
	}
}
