package ar.edu.unq.po2.parcialBanco;

public class MonitoreoSuperficial implements ModoMonitoreoStrategy{
	
	public void monitorear(CajaDeAhorro caja) {
		if (caja.getUltimoMovimiento().getMonto() > 500000d) {
			caja.getMailSender().sendMail(caja.getTitular().getEmail(), "AFIP Monitoreo", "Hola, estamos monitoreando su operatoria. Tranqui");
		}
	}

}
