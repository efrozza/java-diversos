package streams;

import java.util.Arrays;
import java.util.List;

public class StreamDuplicados {
	
	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("João", "Maria", "Jose", "Jose");
		
		nomes.stream()
			 .skip(1) // pula o primeiro item
			 .distinct() // despreza se tiver item repetido
			 .map(e -> concatena(e)) // transforma o item da lista 
			 .forEach(System.out::println); 		
		
	}
	
	public static String concatena (String item) {
		return item + " ++";
	}

}
