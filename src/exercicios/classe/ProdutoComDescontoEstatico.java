package exercicios.classe;

public class ProdutoComDescontoEstatico {

	private String nome;
	private double preco;
	static final double desconto = 0.25;

	ProdutoComDescontoEstatico() {

	}

	ProdutoComDescontoEstatico(String nomeInicial) {
		this.nome = nomeInicial;
	}

	ProdutoComDescontoEstatico(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		preco = preco - (preco * desconto);
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
