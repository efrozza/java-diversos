package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

	public static void consistirDados(Aluno aluno) {
		
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo");
		}

		if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}

		if (aluno.getNota() < 0) {
			throw new NumeroNegativoException("nota");
		}
	}

}
