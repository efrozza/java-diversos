package controle;

public class For3 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j ++) {
				System.out.printf("O valor de i é igual a: %d e o valor de j é igual a %d \n", i, j);	
			}
			
		}
		
		//criando variavel fora do escopo do for 
		
		int i = 100;
		
		System.out.println(i);
	}

}
