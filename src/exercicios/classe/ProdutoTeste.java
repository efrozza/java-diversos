package exercicios.classe;

//como a classe Produto está no mesmo pacote não precisa ser importada

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Teste1");
		Produto p2 = new Produto();

		p1.preco = 4386.39;
		p1.desconto = 0.25;

		p2.nome = "Produto 2";
		p2.preco = 1.50;
		p2.desconto = 0.05;

		System.out.println(p2.nome);
		double precoFinal1 = p1.preco - p1.desconto;

		System.out.println("Preços " + precoFinal1);
		
		ProdutoComDescontoEstatico p3 = new ProdutoComDescontoEstatico("Produto com desconto", 100);
		System.out.println(p3.getNome());
		System.out.println(p3.getPreco());
		System.out.println("O desconto desse produto é " + ProdutoComDescontoEstatico.desconto);

	}

}
