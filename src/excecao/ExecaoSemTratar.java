package excecao;

public class ExecaoSemTratar {

	public static void main(String[] args) {

		// Se vc não quiser tratar a exceção nesse método
//		// deve incluir throws Exception no método pai
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

	// exeção checada deixa claro na assinatura do método através do comando throws

	static void geraErro2() throws Exception {

		throw new Exception("Ocorre um erro nesse ponto 2");

	}
}
