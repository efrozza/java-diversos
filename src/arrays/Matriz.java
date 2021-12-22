package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Vamos calcular a media de uma turma de alunos baseado em x numero de todoas
		//por aluno
		
		System.out.println("Quantos alunos?");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qtdeNotas = entrada.nextInt();
		
		// como array é um objeto , precisa ser instanciado
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length ; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n ++) {
				System.out.printf("informe a nota %d do aluno %d ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Media da turma " + media);
		entrada.close();
		
		System.out.println(Arrays.toString(notasDaTurma));
		
	}
	
}
