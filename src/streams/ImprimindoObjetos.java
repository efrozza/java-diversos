package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana");
		
		System.out.println("Usando Foreach");
		for(String nome: aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nUsando Iterator");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		
		// passando via lambada o metodo println para o forEach
		stream.forEach(System.out::println);
		
	}

}
