package exercicios.classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		//a.PI = 10;
	
		
		AreaCirc b = new AreaCirc(5);
		//b.PI = 5;
		
		//AreaCirc.PI = 3.1415;
		
		System.out.println(a.area());
		
		//AreaCirc.PI = 4.5;
		
		System.out.println(b.area());
		
		System.out.println(AreaCirc.retornaArea(3));
		
		
	}

}
