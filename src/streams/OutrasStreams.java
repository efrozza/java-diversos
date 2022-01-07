package streams;

import java.util.Arrays;
import java.util.List;

public class OutrasStreams {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 2.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10);
        Aluno aluno5 = new Aluno("Gui", 8.1);
        Aluno aluno6 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        System.out.println("Distinct...");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\n TakeWhile...");
        alunos.stream()
                .distinct()
                //.takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);


    }
}
