package oo.heranca;

public class Tracker extends Carro {
	
	// super chama o metodo da classe pai
	// nesse caso , Carro � pai de Tracker ent�o
	// quando chamamos o acelerar vamos chamar o do Carro
	
	Tracker(){
		super(150);
	}
	
	@Override
	void acelerar() {
		super.acelerar();
	}
	
	@Override
	void frear() {
		super.frear();
	}

}
