package oo.heranca;

public class Tracker extends Carro {
	
	// super chama o metodo da classe pai
	// nesse caso , Carro é pai de Tracker então
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
