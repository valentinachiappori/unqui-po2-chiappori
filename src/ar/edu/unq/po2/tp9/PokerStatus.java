package ar.edu.unq.po2.tp9;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class PokerStatus {

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> arrayCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		Map<String, Integer> contadorValores = new HashMap<>();
		Map<Character, Integer> contadorPalos = new HashMap<>();

		
		for (String carta: arrayCartas) {
			String valor = extraerValor(carta);
			char palo = extraerPalo(carta);
			contadorValores.put(valor,contadorValores.getOrDefault(valor, 0) + 1 );
			contadorPalos.put(palo,contadorPalos.getOrDefault(palo, 0) + 1 );
		}
		
		boolean hayPoker = contadorValores.values().stream().anyMatch(cantidad -> cantidad >=4);
		boolean hayColor = contadorPalos.values().stream().anyMatch(cantidad -> cantidad ==5); 
		boolean hayTrio = contadorValores.values().stream().anyMatch(cantidad -> cantidad >=3);

		
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
		 // 
		 
	private static String extraerValor(String carta) {
        if (carta.length() == 3) {
            // Para cartas con valor 10 (que tienen tres caracteres, ej. "10D")
            return carta.substring(0, 2);  // Los dos primeros caracteres son el valor
        } else {
            // Para el resto de las cartas (que tienen dos caracteres)
            return carta.substring(0, 1);  // El primer carácter es el valor
        }
	}
	
	private static char extraerPalo(String carta) {
        return carta.charAt(carta.length() - 1);
	}
}
