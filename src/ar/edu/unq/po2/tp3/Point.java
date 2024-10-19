package ar.edu.unq.po2.tp3;

public class Point {

	private int valorX;
	private int valorY;
	
	public Point(int valorX, int valorY) {
		this.valorX = valorX;
		this.valorY = valorY;
	}
	
	public Point() {
		this.valorX = 0;
		this.valorY = 0;
	}
	
	
	public int getValorX() {
		return valorX;
	}

	public int getValorY() {
		return valorY;
	}


	public void moverPuntoA(int valorX, int valorY){
		this.valorX = valorX;
		this.valorY = valorY;
	}
	
	public Point sumarPunto (Point punto) {
		int newValorX = punto.getValorX();
		int newValorY = punto.getValorY();
		
		return new Point(newValorX,newValorY);
	}
}
