package textos;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TrabalhandoStrings {

	public static String concatenarString(String[] arrayString) {
		return Arrays.asList(arrayString)
				.stream()
				.collect(Collectors
				.joining(","));
	}

	public static void main(String[] args) {

		String[] linguagensProgramacao = { "java", "python", "nodejs", "ruby" };
		String expectation = "java,python,nodejs,ruby";

		String result = concatenarString(linguagensProgramacao);
		System.out.println(result);
		
		String teste = "123456789";
		System.out.println(teste.substring(0,2));

	}
	
	
	

}
