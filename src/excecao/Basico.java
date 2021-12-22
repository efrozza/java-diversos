package excecao;

public class Basico {

	public static void main(String[] args) {

		//System.out.println(7 / 0);

		Aluno a1 = null;

		try {
			imprmirAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Ocorreu erro ao imprimir aluno");
		}

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException a) {
			// o print stack trace mostra o fluxo onde o erro foi gerado
			//a.printStackTrace();
			
			System.out.println("Ocorreu erro " + a.getMessage());
		}

		System.out.println("fim");

	}

	public static void imprmirAluno(Aluno aluno) {

		System.out.println(aluno.getNome());

	}

}
