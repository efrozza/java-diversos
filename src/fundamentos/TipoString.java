package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		//obter caracter indexado na String
		System.out.println("Olá, pessoal".charAt(2));
		
		String s = "Boa tarde";

		System.out.println("Concatena ");
		System.out.println(s.concat("!!!"));

		System.out.println("String iniciada em Boa ");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Pedro";
		String sobrenome = "Silva";
		double multa = 55.25;
		
		System.out.printf("O ser %s %s foi notificado. Multa de: %.2f \n", nome, sobrenome, multa);
		
		String fraseCompleta = String.format("O ser %s %s foi notificado. Multa de: %.2f", nome, sobrenome, multa);
		System.out.println(fraseCompleta);
		
	}

}
