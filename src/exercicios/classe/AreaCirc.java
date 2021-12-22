package exercicios.classe;

public class AreaCirc {

	double raio;
	// normalmente atributos staticos não vamos querer permitir alteração , então definimos como constante final
	static final double PI = 3.14;

	public AreaCirc(double raioInicial) {

		this.raio = raioInicial;
	}

	double area() {
		return raio * raio * PI;
	}
	
	static double retornaArea (double raio) {
		return raio * raio * PI;
	}
}
