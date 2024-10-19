package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Point esquinaSuperiorDerecha;
	private Point esquinaInferiorIzquierda;
	
	public Rectangulo(Point esquinaSuperiorDerecha, Point esquinaInferiorIzquierda) {
		
		if (esquinaInferiorIzquierda.getValorX() <= esquinaSuperiorDerecha.getValorX() &&
				esquinaInferiorIzquierda.getValorX() <= esquinaSuperiorDerecha.getValorY()){
			this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
			this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
		} else {
        throw new IllegalArgumentException("Las coordenadas no forman un rectángulo válido.");
		}
	}
	
	public int calcularArea() {
		return this.getAncho() * this.getAlto();
	}
	
	public int getAncho() {
		return esquinaSuperiorDerecha.getValorX() - esquinaInferiorIzquierda.getValorX();
	}
	
	public int getAlto() {
		return esquinaSuperiorDerecha.getValorY() - esquinaInferiorIzquierda.getValorY();
	}
	
	public int calcularPerimetro() {
		return  2 * (this.getAlto() + this.getAncho());
	}
	
	public boolean esVertical() {
		return getAlto() > getAncho();
	}
	
	public boolean esHorizontal() {
		return getAncho() > getAlto();
	}
}
