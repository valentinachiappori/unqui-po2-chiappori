package ar.edu.unq.po2.parcialBanco;

public class AFIP implements AgenciaObserver{
	
	private ModoMonitoreoStrategy modoMonitoreo;
	
	public void update(CajaDeAhorro caja) {
		if (caja.getUltimoMovimiento().getOperacion() == "Deposito") {
			modoMonitoreo.monitorear(caja);
		}
	}
}
