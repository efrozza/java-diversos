package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		// aqui vc esta guardando um double
		caixaA.guardar(2.3);
		
		// tentando obter convertendo para Integer vai gerar um Cast Exception
		Integer coisa = (Integer) caixaA.abrir();
		System.out.println(coisa);
	}

}
