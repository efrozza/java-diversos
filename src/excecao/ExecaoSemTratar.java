package excecao;

public class ExecaoSemTratar {

	public static void main(String[] args) {

		// Se vc n�o quiser tratar a exce��o nesse m�todo
//		// deve incluir throws Exception no m�todo pai
//		try {
//			geraErro2();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

		acessaErro2();
		
		
		System.out.println("fim");

	}
	
	static void acessaErro2() {
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// exe��o checada deixa claro na assinatura do m�todo atrav�s do comando throws

	static void geraErro2() throws Exception {

		throw new Exception("Ocorre um erro nesse ponto 2");

	}
}
