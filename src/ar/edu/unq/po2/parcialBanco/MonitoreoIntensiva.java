package ar.edu.unq.po2.parcialBanco;

public class MonitoreoIntensiva implements ModoMonitoreoStrategy {

	public void monitorear(CajaDeAhorro caja) {
		if (caja.getSaldo() > 50000000d && caja.getAntiguedad() > 1) {
			caja.getMailSender().sendMail(caja.getTitular().getEmail(), "AFIP Monitoreo", "Hola, estamos monitoreando su operatoria. Tranqui");
		}
	}
}
