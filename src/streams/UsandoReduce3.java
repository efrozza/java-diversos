package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.*;
import java.util.stream.DoubleStream;

public class UsandoReduce3 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> apenasNota = aluno -> aluno.nota;

        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia =
                (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                //.reduce(new Media(), calcularMedia, combinarMedia);
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A media da turma eh " + media.getValor());

        DoubleBinaryOperator minimoValor = (d1, d2) -> Math.min(d1, d2);

        OptionalDouble reduce = DoubleStream.of(1.5, 2.9, 6.7)
                .reduce(minimoValor);
        System.out.println(reduce);

        // funcao de combinaçao



    }
}
