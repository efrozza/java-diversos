package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        Function<String, Integer> converteStringParaInteiro = (textoParaConversao) -> {
            return Integer.parseInt(textoParaConversao, 2);
        };

        UnaryOperator<String> inverterString = (stringParaInversao) -> {
            return new StringBuilder(stringParaInversao).reverse().toString();
        };

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // chamamos o toBinarySTring da classe Integer através
        // do recurso de reference method
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverterString)
                .map(converteStringParaInteiro)
                .forEach(System.out::println);
    }
}
