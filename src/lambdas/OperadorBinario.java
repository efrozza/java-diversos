package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        //BinaryOperator espera dois argumentos e retorna um dado , todos do mesmo tipo da entrada
        // no exemplo abaixo Double
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        Function<Boolean,String> mensagemResultadoAluno = resultado -> resultado.booleanValue() ? "Você foi aprovado" : "Você foi reprovado";
        BiFunction<Double, Double, Boolean> verificaAlunaAprovado = (nota1, nota2) -> {
            double mediaFinal = media.apply(nota1, nota2);
            return mediaFinal >= 7 ? true : false;
        };

        System.out.println(media.apply(9.8, 5.7));
        System.out.println(verificaAlunaAprovado.andThen(mensagemResultadoAluno).apply(7.0,8.0));
    }
}
