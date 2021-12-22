package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UsandoMatch {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 2.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;

        // verifica se todos os itens da lista retornaram true para o predicado "aprovado"
        System.out.println(alunos.stream().allMatch(aprovado));

        // verifica se algum os itens da lista retornou true para o predicado "aprovado"
        System.out.println(alunos.stream().anyMatch(aprovado));

        // verifica se nenhum dos itens da lista retornou true para o predicado "aprovado"
        System.out.println(alunos.stream().noneMatch(aprovado));

    }
}
