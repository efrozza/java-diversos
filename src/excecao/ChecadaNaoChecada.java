package excecao;

public class ChecadaNaoChecada {

	public static void main(String[] args) {

		// exce��es do tipo runtime n�o exigem tratamento do erro
		try {
			geraErro1();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Se vc n�o quiser tratar a exce��o nesse m�todo
		// deve incluir throws Exception no m�todo pai
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("fim");

	}

	// exce��o N�O checada
	static void geraErro1() {
		throw new RuntimeException("Ocorre um erro nesse ponto 1");
	}

	// exe��o checada deixa claro na assinatura do m�todo atrav�s do comando throws

	static void geraErro2() throws Exception {
		throw new Exception("Ocorre um erro nesse ponto 2");
	}
}
