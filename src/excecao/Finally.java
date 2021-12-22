package excecao;

import java.util.Scanner;

public class Finally {
	
	// o bloco finally sempre é executado
	// ou seja, em acessos a banco de dados etc em q precisamos fechar por exemplo uma conexao ou algo assim

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalmente");
			entrada.close();
		}
	}

}
