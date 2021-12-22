package textos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		// quando usamos o new estamos criando outra referencia na memoria
		String s1 = new String("2");
		boolean verificaStringIgual = "2" == s1;
		System.out.println("2 é igual a " + s1 + "?: " + verificaStringIgual);;
		
		// O equal compara o conteudo e não a referencia de memoria
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2);
		
		// trim remove espaços em branco
		System.out.println("2".equals(s2.trim()));
		entrada.close();
	}

}
