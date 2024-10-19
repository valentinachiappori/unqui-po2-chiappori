package ar.edu.unq.po2.tp6_PalabrasOrdenadas;

public class AdapterPalabrasOrdenadas implements DefaultListModel{
	
	private ListaDePalabrasOrdenadas lista;
	
	public AdapterPalabrasOrdenadas (ListaDePalabrasOrdenadas lista) {
		this.lista=lista;
	}
	
	public void addElement(String elem) {
		this.lista.agregarPalabra(elem);
	}
	
}
