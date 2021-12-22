package oo.heranca;

public class Ferrari extends Carro implements Esportivo{

	public Ferrari() {
		super(200);
	}

	@Override
	void acelerar() {
		velocidadeAtual += 10;
	}

	@Override
	void frear() {
		if (velocidadeAtual >= 10) {
			velocidadeAtual -= 10;
		}
	}

	@Override
	public void ligarTurbo() {
		System.out.println("ligando turbo na ferrari");
		
	}

	@Override
	public void desligarTurbo() {
		System.out.println("desligando turbo na ferrari");
		
	}

}
