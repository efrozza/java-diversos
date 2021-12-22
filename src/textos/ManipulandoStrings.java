package textos;

public class ManipulandoStrings {
	
	public static void main(String[] args) {
		
		String teste = "Isso é um teste.";
		System.out.println(teste);
		
		//0123456789012345
		//Isso é um teste.
		//substring começando do índice 10
		System.out.println("Tamanho da string " + teste.length());
		System.out.println(teste.substring(10, teste.length()));
		// o segundo parametro que é o índice até, não é inclusivo, ou seja
		// vai pegar do índice 10 até o 14, logo o ponto não será impresso
		System.out.println(teste.substring(10));

		String ola = "olá";
		String mundo = " mundo";
		
		//concatenar
		System.out.println("Concatenando strings");
		System.out.println(ola.concat(mundo));
		
		//espaço e alteração de caracteres

		System.out.println("Substituindo caracter");
		String espacos = "i s p a ç o";
		String semEspacoes = espacos.replace("i", "e");
		System.out.println(semEspacoes);

		System.out.println("Removendo todos os espaços");
		semEspacoes = semEspacoes.replaceAll(" ", "");
		System.out.println(semEspacoes);
		
		String nome = " meu nome é: ";
		System.out.println(nome);

		System.out.println("removendo todos os espaços em branco no início e no final da string");
		System.out.println(nome.trim());

		String textNovo = "Teste se esta ok";
        System.out.println(textNovo.startsWith("T"));
        System.out.println(textNovo.substring(0,2));
        System.out.println(textNovo.substring(0,textNovo.length()));
		
	}

}
