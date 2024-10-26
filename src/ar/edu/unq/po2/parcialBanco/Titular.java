package ar.edu.unq.po2.parcialBanco;

public class Titular {
	private String nombre;
	private String direccion;
	private String email;
	
	public Titular(String nombre, String direccion, String email) {
		this.nombre =  nombre;
		this.direccion = direccion;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEmail() {
		return email;
	}
	
}
