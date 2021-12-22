package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "n/a";

		switch (faixa.toLowerCase()) {

		case "preta":
			System.out.println("Pessoa faixa preta");
			break;

		case "marrom":
			System.out.println("Pesoa faixa marron");
			break;

		default: 
			System.out.println("Não faz karate");
		
		}

		System.out.println("Exemplo 2");
		// sem break vai executar todos os cases abaixo do que encontrou como verdade

		String faixa2 = "preta";

		switch (faixa2.toLowerCase()) {

			case "preta":
				System.out.println("Pessoa faixa preta");

			case "vermelha":
				System.out.println("Pessoa faixa vermelha");

			case "marrom":
				System.out.println("Pessoa faixa marron");


		}

	}

}
