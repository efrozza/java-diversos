package exercicios.classe;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		String a = "texto";
		a.toUpperCase();
		System.out.println(a);
		
		// A String é uma classe por isso tem atributos e métodos
		// já o int por exemplo é tipo primitivo e só armazena valor
		// para cada tipo primitivo temos Wrappers que ai são classes com atributos e métodos
		
		int b = 1;
		System.out.println(b);
		
		
		
	}

}
