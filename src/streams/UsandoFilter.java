package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class UsandoFilter {

    public static void main(String[] args) {

        Predicate<Aluno> validaAlunoAprovado = aluno -> (aluno.nota >= 7.0);
        Function<Aluno, String> fraseDeParabens = aluno -> "Parabens " + aluno.nome + " você foi aprovado";

        Aluno aluno1 = new Aluno("Ana", 7.8);
        Aluno aluno2 = new Aluno("Bia", 5.8);
        Aluno aluno3 = new Aluno("Daniel", 9.8);
        Aluno aluno4 = new Aluno("Gui", 6.8);
        Aluno aluno5 = new Aluno("Rebeca", 7.1);
        Aluno aluno6 = new Aluno("Pedro", 8.8);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        // no caso abaixo filter ainda retorna um aluno
        // porem o map esta transformando o restulado em string
        // então a proxima funcao encadeada deve receber string
        alunos.stream()
                .filter(validaAlunoAprovado)
                .map(fraseDeParabens)
                .forEach(System.out::println);

        // EXEMPLO 2

        System.out.println("Exemplo 2");
        List<String> pessoas = Arrays.asList("Joao", "Maria", "Jose", "Pedro");

        pessoas.stream()
                .filter((pessoa) -> pessoa.equals("Joao"))
                .forEach(System.out::println);

        long count = pessoas.stream()
                .filter((pessoa) -> pessoa.equals("Joao"))
                .count();
        System.out.println("Pessoal com nome joao " + count);

    }
}
