package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	private Caja caja1;
	
	@BeforeEach
	public void setUp() {

		Producto arroz = new ProductoCooperativo("Arroz", 18.9d, 2);
		Producto detergente = new ProductoTradicional("Detergente", 75d, 3);
		Impuesto imp1 = new Impuesto(35d);
		Servicio gas = new Servicio(400d, 3d);
	    
		caja1 = new Caja();
		
		caja1.registrar(detergente);
		caja1.registrar(imp1);
		caja1.registrar(gas);
	}

	@Test
	public void testTotalTotal() {
		assertEquals(1310d, caja1.cobrar());
	}

}