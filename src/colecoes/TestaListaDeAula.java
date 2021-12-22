package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando ArrayList", 21);
		Aula a2 = new Aula("Listas de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		// quando imprimimos o arrary de objetos o java java o toString de cada objeto
		// o toString é um método da classe mae Object
		System.out.println(aulas);
		
		Collections.sort(aulas);		
		System.out.println(aulas);
 
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
