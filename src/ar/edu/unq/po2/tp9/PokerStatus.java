package ar.edu.unq.po2.tp9;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class PokerStatus {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Carta> arrayCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		Map<String, Integer> contadorValores = new HashMap<>();
		Map<String, Integer> contadorPalos = new HashMap<>();
		
		for (Carta carta: arrayCartas) {
			String valor = carta.getValor();
			String palo = carta.getPalo();
			contadorValores.put(valor,contadorValores.getOrDefault(valor, 0) + 1 );
			contadorPalos.put(palo,contadorPalos.getOrDefault(palo, 0) + 1 );
		}
		
		boolean hayPoker = contadorValores.values().stream().anyMatch(cantidad -> cantidad >=4);
		boolean hayTrio = contadorValores.values().stream().anyMatch(cantidad -> cantidad ==3);
		boolean hayColor = contadorPalos.values().stream().anyMatch(cantidad -> cantidad ==5); 
		
		
		if (hayPoker) {
			return "Poquer";
		} else if (hayColor){
			return "Color";
		} else if (hayTrio) {
			return "Trio";
		} else {
			return "Nada";
		}
	}
}
