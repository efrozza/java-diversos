package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTest3 {

    public static void main(String[] args) {

        // o java prove algumas interfaces funcionais
        // o tipo definido no generics é tanto para os parametros como para o retorno
        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(2.0,3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
        System.out.println(calc2.apply(5,4));
        // tambem podemos utilizar o return implicito para funções de uma linha
        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0,3.0));
    }
}
