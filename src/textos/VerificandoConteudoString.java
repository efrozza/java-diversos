package textos;

public class VerificandoConteudoString {

	public static void main(String[] args) {

		String s = "15A";
		int v = 0;
		String apenasLiteral = "ABC";

		// verifica se a string s� contem n�meros
		if (s.matches("[0-9]*")) {
			v = Integer.parseInt(s);
			System.out.println(v);
		} else {
			System.out.println("valor n�o � n�merico " + s);
		}

		if	(apenasLiteral.matches("[A-Z]*")) {
			System.out.println("APENAS LITERAL: " + apenasLiteral);
		}
		
	}

}
