package exercicios.classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	Produto (){
		
	}

	Produto(String nomeInicial) {
		this.nome = nomeInicial;
	}

	Produto (String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
}
