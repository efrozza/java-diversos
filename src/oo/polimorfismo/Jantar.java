package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.54);
		
		Arroz ingrediente1 = new Arroz(0.25);
		Feijao ingrediente2 = new Feijao(0.185);
		
		System.out.println(ingrediente1.getPeso());
		System.out.println(ingrediente2.getPeso());
		
	}

}
