package ar.edu.unq.po2.parcialBanco;

public class Movimiento {
	private String operacion;
	private Double monto;
	
	public Movimiento(String operacion, Double monto) {
		this.operacion = operacion;
		this.monto = monto;
	}
	
	public String getOperacion() {
		return operacion;
	}
	
	public Double getMonto() {
		return monto;
	}
}
