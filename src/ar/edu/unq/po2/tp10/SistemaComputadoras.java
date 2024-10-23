package ar.edu.unq.po2.tp10;

public class SistemaComputadoras {
	
	private EncriptadorNaive encriptador;
	
	public SistemaComputadoras(EncriptadorNaive encriptador) {
		this.encriptador = encriptador;
	}

	public EncriptadorNaive getEncriptador() {
		return encriptador;
	}

	public void setEncriptador(EncriptadorNaive encriptador) {
		this.encriptador = encriptador;
	}
	
	public String encriptar(String mensaje) {
		return this.encriptador.encriptar(mensaje);
	}
	
	public String desencriptar(String mensaje) {
		return this.encriptador.desencriptar(mensaje);
	}
}
