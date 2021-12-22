package arrays;

public class ForEach {

	public static void main(String[] args) {

		double[] notas = { 9.5, 8.0, 7.3, 9.4 };

		for (double nota : notas) {
			System.out.println(nota);
		}

		System.out.println("usando for normal");

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

	}

}
