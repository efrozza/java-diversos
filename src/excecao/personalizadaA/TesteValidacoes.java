package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Nome do aluno", 9);

		try {
			Validar.consistirDados(aluno);
			Validar.consistirDados(null);
		} catch (StringVaziaException e) {
			System.out.println("String vazia");

		} catch (NumeroNegativoException e) {
			System.out.println("Número negativo");
		}

		System.out.println("fim");

	}

}
