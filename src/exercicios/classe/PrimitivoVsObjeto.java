package exercicios.classe;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		String a = "texto";
		a.toUpperCase();
		System.out.println(a);
		
		// A String � uma classe por isso tem atributos e m�todos
		// j� o int por exemplo � tipo primitivo e s� armazena valor
		// para cada tipo primitivo temos Wrappers que ai s�o classes com atributos e m�todos
		
		int b = 1;
		System.out.println(b);
		
		
		
	}

}
