package ar.edu.unq.po2.parcialBanco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CajaDeAhorro {

	private int numero;
	private Double saldo;
	private LocalDate fechaDeCreacion;
	private Titular titular;
	private MailSender mailSender;
	private List<AgenciaObserver> agencias;
	private List<Movimiento> movimientos;
	
	public CajaDeAhorro(int numero, Double saldo, LocalDate fechaDeCreacion, Titular titular, MailSender mailSender) {
		this.numero = numero;
		this.saldo = saldo;
		this.fechaDeCreacion = fechaDeCreacion;
		this.titular = titular;
		this.mailSender = mailSender;
		this.agencias = new ArrayList<AgenciaObserver>();
		this.movimientos = new ArrayList<Movimiento>();
	}
	
	public void addAgencia(AgenciaObserver agencia) {
		this.agencias.add(agencia);
	}
	
	public void removeAgencia(AgenciaObserver agencia) {
		this.agencias.remove(agencia);
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public MailSender getMailSender() {
		return mailSender;
	}
	
	public Titular getTitular() {
		return titular;
	}
	
	public void notificar(CajaDeAhorro caja) {
		for (AgenciaObserver agencia: agencias) {
			agencia.update(caja);
		}
	}
	
	public void depositar(Double monto) {
		this.saldo += monto;
		this.movimientos.add(new Movimiento("Deposito",monto));
		notificar(this);
	}
	
	public void extraer(Double monto) {
		this.saldo -= monto;
		this.movimientos.add(new Movimiento("Extraccion",monto));
		notificar(this);
	}
	
	public Movimiento getUltimoMovimiento() {
		return this.movimientos.getLast();
	}

	public int getAntiguedad() {		
		return LocalDate.now().getYear() - this.fechaDeCreacion.getYear() ;
	}
	
	/**
	 * OBSERVER
	 * Subject y ConcreteSubject: CajaDeAhorro
	 * Observer: Agencia
	 * ConcreteObserver: ARBA y AFIP
	 * 
	 * STRATEGY
	 * Context: AFIP
	 * Strategy: ModoMonitoreoStrategy
	 * ConcreteStrategy: Superficial e Intensiva.
	 */
}
