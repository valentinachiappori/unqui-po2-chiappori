package ar.edu.unq.po2.tp4;

public class Ingreso {

	private String mes;
	private String concepto;
	private Double monto;
	
	
	public Ingreso(String mes, String concepto, Double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
		
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	public Double getMontoImponible() {
		return this.getMonto();
	}
}
