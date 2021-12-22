package arrays;

public class OperacoesBasicasArray {

	public static void main(String[] args) {

		// declarando array
		// tipo + [] + nome ou nome + []
		double[] precos = { 1.50, 1, 20 };
		int idade[] = { 10, 20 };
		
		// instanciando - Vetores são ojbetos
		char letras[] = new char[4];
		letras[0] = 'a';
		letras[1]= 'b';
		
		// consultando array
		
		System.out.println("idade " + idade[0]);
		
		// percorrendo array
		for (int id : idade) {
			System.out.println(id);
		}

	}

}
