package tellDontAsk;

public class Conta {

	private double saldo;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

}
