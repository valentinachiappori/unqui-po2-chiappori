package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso {

	private int cantHorasExtra;

	public IngresoHorasExtras(String mes, String concepto, Double monto, int cantHorasExtra) {
		super(mes, concepto, monto);
		this.cantHorasExtra = cantHorasExtra;
	}
	
	@Override
	public Double getMontoImponible() {
		return 0d;
	}
}
