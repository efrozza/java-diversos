package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Nome do aluno", 9);

		try {
			Validar.consistirDados(aluno);
		
		} catch (StringVaziaException e) {
			System.out.println("String vazia");

		} catch (NumeroNegativoException e) {
			System.out.println("Número negativo");
		}

		try {
			Validar.consistirDados(null);
		} catch (StringVaziaException e) {
		
			e.printStackTrace();
		} catch (NumeroNegativoException e) {
	
			e.printStackTrace();
		}
		System.out.println("fim");

	}

}
