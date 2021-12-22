package textos;

public class UsandoStringBuilderBuffer {
	
	public static void main(String[] args) {

		// Sem usar StringBuffer

		String []letras = {"B", "C", "D", "E", "F"};
		String alfabeto = "";
		
		for (String letra : letras) {
			alfabeto += letra;
		}
		
		System.out.println(alfabeto);
		
		
		// fazendo o exemplo acima com StringBuffer 
		// que tem muito mais performance trabalhando com strings grandes
		StringBuffer sb = new StringBuffer();
		
		for (String letra: letras) {
			sb.append(letra);
		}
		
		alfabeto = sb.toString();
		System.out.println(alfabeto);
		
		// podemos fazer também
		
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		// invertendo a string
		System.out.println(sb.reverse());
		
		// usando string 
		StringBuilder sb1 = new StringBuilder();
				
	}
	
	

}
