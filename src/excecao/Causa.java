package excecao;

public class Causa {

	public static void main(String[] args) {
		metodoA(null);
	}

	static void metodoA(Aluno aluno) {
		// metodoB(aluno);
		// caso queira tratar o erro de outra forma

		try {
			metodoB(null);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}

	static void metodoB(Aluno aluno) {

		if (aluno == null) {
			throw new NullPointerException("Aluno está nullo");
		}

		System.out.println(aluno.getNome());

	}
}
