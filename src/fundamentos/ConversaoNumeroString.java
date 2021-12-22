package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println("Obtendo tamanho " + num1.toString().length());
		
		int num2 = 100000;
		System.out.println("Convertendo int em String " + Integer.toString(num2));
		
		// não recomendado
		System.out.println(("" + num2).length());

		// se colocarmos o zero a esquerda o java entende a base octal e ai não aceita como long
		//long CPF_CNPJ = 052165889000165L;
		long cpf = 52165889000165L;

		System.out.println(String.valueOf(cpf));
		
	}

}
