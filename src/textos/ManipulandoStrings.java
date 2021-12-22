package textos;

public class ManipulandoStrings {
	
	public static void main(String[] args) {
		
		String teste = "Isso � um teste.";
		System.out.println(teste);
		
		//0123456789012345
		//Isso � um teste.
		//substring come�ando do �ndice 10
		System.out.println("Tamanho da string " + teste.length());
		System.out.println(teste.substring(10, teste.length()));
		// o segundo parametro que � o �ndice at�, n�o � inclusivo, ou seja
		// vai pegar do �ndice 10 at� o 14, logo o ponto n�o ser� impresso
		System.out.println(teste.substring(10));

		String ola = "ol�";
		String mundo = " mundo";
		
		//concatenar
		System.out.println("Concatenando strings");
		System.out.println(ola.concat(mundo));
		
		//espa�o e altera��o de caracteres

		System.out.println("Substituindo caracter");
		String espacos = "i s p a � o";
		String semEspacoes = espacos.replace("i", "e");
		System.out.println(semEspacoes);

		System.out.println("Removendo todos os espa�os");
		semEspacoes = semEspacoes.replaceAll(" ", "");
		System.out.println(semEspacoes);
		
		String nome = " meu nome �: ";
		System.out.println(nome);

		System.out.println("removendo todos os espa�os em branco no in�cio e no final da string");
		System.out.println(nome.trim());

		String textNovo = "Teste se esta ok";
        System.out.println(textNovo.startsWith("T"));
        System.out.println(textNovo.substring(0,2));
        System.out.println(textNovo.substring(0,textNovo.length()));
		
	}

}
