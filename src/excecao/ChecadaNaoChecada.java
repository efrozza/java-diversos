package excecao;

public class ChecadaNaoChecada {

	public static void main(String[] args) {

		// exceções do tipo runtime não exigem tratamento do erro
		try {
			geraErro1();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Se vc não quiser tratar a exceção nesse método
		// deve incluir throws Exception no método pai
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("fim");

	}

	// exceção NÃO checada
	static void geraErro1() {
		throw new RuntimeException("Ocorre um erro nesse ponto 1");
	}

	// exeção checada deixa claro na assinatura do método através do comando throws

	static void geraErro2() throws Exception {
		throw new Exception("Ocorre um erro nesse ponto 2");
	}
}
