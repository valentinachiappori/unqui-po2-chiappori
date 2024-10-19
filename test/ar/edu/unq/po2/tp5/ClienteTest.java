package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;




class ClienteTest {

	private Cliente cliente1;
	
	@BeforeEach
public void setUp() {

		Producto arroz = new Cooperativo("Arroz", 18.9d);
		Producto detergente = new EmpresaTradicional("Detergente", 75d);
	    
		cliente1 = new Cliente("Valentina");
		
		cliente1.agregarProducto(arroz);
		cliente1.agregarProducto(detergente);		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
