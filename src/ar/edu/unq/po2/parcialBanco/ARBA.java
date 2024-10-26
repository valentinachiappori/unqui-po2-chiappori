package ar.edu.unq.po2.parcialBanco;

public class ARBA implements AgenciaObserver{
	
	public void update(CajaDeAhorro caja) {
		if (caja.getUltimoMovimiento().getOperacion() == "Extraccion") {
			caja.getMailSender().sendMail(caja.getTitular().getEmail(),"ARBA Impuestos", "Antes de gastar su dinero, recuerde pagar sus impuestos"); 
		}
	}
	
}
