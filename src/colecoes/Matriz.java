package colecoes;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Quantos alunos");
        int qtdeAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
        double total = 0;

        for (int alunos = 0; alunos < notasDaTurma.length; alunos++){
            for (int notaAluno = 0; notaAluno < notasDaTurma[alunos].length; notaAluno++){
                System.out.printf("Informe a nota %d do aluno %d: ", notaAluno + 1, alunos + 1 );
                notasDaTurma[alunos][notaAluno] = entrada.nextDouble();
                total += notasDaTurma[alunos][notaAluno];
            }
        }
        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é + " + media);

        // o notasDaturma é um array que em cada posicao tem outro array 
        // então o for vai extrair um array por linha percorrida do array externo
        // com o Arrays ultil conseguimos extrair o conteudo de tod array para string
        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
        entrada.close();

    }
}
