package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Everton";
		c1.itens.add(new Item("Vinil", 1, 150.00));
		c1.itens.add(new Item("CD", 2, 50.00));
		c1.itens.add(new Item("Camiseta", 1, 30.00));
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());

	}
}
