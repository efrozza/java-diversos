package exercicios.classe;

public class PrimeiroTrauma {
	
	int a = 3;
	static int b = 4;
			
	public static void main(String[] args) {
		
		// mesmo estando na propria classe, s� conseguimos acessar um valor de uma vari�vel de instancia, criando uma instancia
		
		PrimeiroTrauma obj = new PrimeiroTrauma();
		System.out.println(obj.a);
		
		// statico acesso statico
		
		System.out.println(b);
	}

}
