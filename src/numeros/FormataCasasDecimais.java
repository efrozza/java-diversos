package numeros;

import java.text.DecimalFormat;

public class FormataCasasDecimais {
	
	public static void main(String[] args) {
		
		double peso = 80.4, altura = 1.77;
		double imc = peso/(altura * 2);
		
		System.out.println("Indice massa corporal " + imc);

		//o %.2f indica que sera duas casas depois do ponto
		System.out.printf("Indice massa corporal %.2f \n", imc);

		//o %
		System.out.printf("Indice massa corporal %.3f \n", imc);
		
		// dando new volta um objeto DecimalFormat que possamos acessar atraves do .
		
		System.out.println(new DecimalFormat(".##").format(imc));

		
	}

}
