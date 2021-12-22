package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class UsandoReduce2 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> apenasNota = aluno -> aluno.nota;
        BinaryOperator<Double> somatorio = (acumulador, valoratual) -> acumulador + valoratual;

        alunos.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);

        // 1 - transformamos a List de alunos em stream
        // 2 - Filtramos a lista de alunos reduzindo apenas aos alunos com nota >= 7
        // 3 - o map transformou o stream em um stream de double com as notas dos alunos
        // 4 - o reduce fez o somatario de notas
        // 5 - o reduce retorna um Optional, então testamos se ele existe e passamos o retorno
        // para o metodo println do System.out

    }
}
