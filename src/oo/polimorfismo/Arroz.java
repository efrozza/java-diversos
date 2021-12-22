package oo.polimorfismo;

public class Arroz extends Comida {

	public Arroz(double peso) {
		super(peso);
	}

	// subscrita de metodo 
	public void setPeso(double peso) {
		if (peso >= 1) {
			this.setPeso(peso);;
		}
	}

}
