package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;

	ArrayList<Item> itens = new ArrayList<Item>();

	double obterValorTotal() {
		
		double totalCompra = 0;
		
		for (Item item : itens) {
			totalCompra += item.preco * item.quantidade;
		}
		return totalCompra;
	}

}
