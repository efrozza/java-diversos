package arrays;

import java.util.Arrays;

public class UsandoArray {
	
	public static void main(String[] args) {
		
		// tipoDedados do array [] indica que é array [3] - qtde de elementos
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 5;
		notasAlunoA[2] = 6.7;

		// inicializar array
		double[] notasAlunoB = {6, 7, 8.9, 10};
		
		System.out.println(notasAlunoA);
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		
		for (double nota: notasAlunoA) {
			total += nota;
		}
				
		System.out.println(total / notasAlunoA.length);
		
		total = 0;

		for (double notaB : notasAlunoB) {
			total += notaB;
		}

		System.out.println(total / notasAlunoB.length);
		
	}

}
