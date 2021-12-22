package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class UsandoReduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acumulador, valorAtual) -> acumulador + valorAtual;

        // o retorno do reduce é um Optional do tipo de retorno da função passada
        // nesse exemplo um Optional <Integer>
        int total = nums.stream().reduce(soma).get();
        System.out.println(total);

        nums.stream()
                .filter((n -> n > 5))
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}
