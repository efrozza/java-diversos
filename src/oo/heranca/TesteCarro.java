package oo.heranca;

public class TesteCarro {

	public static void main(String[] args) {

		Carro ferrari = new Ferrari();
		Carro tracker = new Tracker();
		Carro carroPadrao = new Carro(150);
		
		ferrari.acelerar();
		tracker.acelerar();
		carroPadrao.acelerar();
		
		System.out.println("Velocidade Ferrari " + ferrari.velocidadeAtual);
		System.out.println("Velocidade Tracker " + tracker.velocidadeAtual);
		System.out.println("Velocidade Carro Padrao " + carroPadrao.velocidadeAtual);
		
		System.out.println(carroPadrao);

	}

}
