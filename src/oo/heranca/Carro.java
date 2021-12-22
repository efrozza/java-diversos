package oo.heranca;

public class Carro {

	final int VELOCIDADE_MAXIMA;

	int velocidadeAtual;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerar() {

		if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += 5;

		}

	}

	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}
	}

	@Override
	public String toString() {

		return ("A velocidade atual é " + this.velocidadeAtual);
	}

}
