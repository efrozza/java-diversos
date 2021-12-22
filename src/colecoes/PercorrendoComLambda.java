package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PercorrendoComLambda {

	public static void main(String[] args) {

		List<String> aulas = new ArrayList<>();
		
		//incluindo
		aulas.add("Lean Digital");
		aulas.add("Lean Ágil");
		aulas.add("aula 2");
		aulas.add("aula 5");
		aulas.add("aula 4");
		


		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println("quantidade de aulas" + aulas.size());

		
		//ordenando		
		Collections.sort(aulas);

		for (String aula : aulas) {

			System.out.println(aula);

		}
	}

}
