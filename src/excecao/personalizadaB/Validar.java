package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {

	// o throws indica que tipo de Exception podem ser lan�adas
	public static void consistirDados(Aluno aluno) throws StringVaziaException, NumeroNegativoException {
		
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno est� nulo");
		}

		if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}

		if (aluno.getNota() < 0) {
			throw new NumeroNegativoException("nota");
		}
	}

}
