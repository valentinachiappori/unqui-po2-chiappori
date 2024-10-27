package ar.edu.unq.po2.parcialPlanDeAhorro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlanDeAhorroTest {

	private Cliente cliente;
	private PlanDeAhorro plan;
	private Retribucion retribucion;
	
	@BeforeEach
	void setUp() throws Exception {
	plan = new PlanDeAhorro(cliente, retribucion, "marca", "modelo", 6, "cbu");
	}

	@Test
	void testCantCuotasDelPlan() {
		assertTrue(plan.getEstado() instanceof Creado);
		assertEquals(plan.getCuotasPagadas(), 0);
		plan.pagarCuota();
		assertEquals(plan.getCuotasPagadas(), 1);
		assertTrue(plan.getEstado() instanceof Vigente);
	}

}
