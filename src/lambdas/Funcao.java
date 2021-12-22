package lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {
        Function<Integer, String> paraOuImpar = (numero) -> numero % 2 == 0 ? "par" : "ímpar";
        Function<String, String> oResultadoEh = valor -> "O resultado é: " + valor;
        Function<String, String> empolgado = valor -> valor + " !!!";

        System.out.println(paraOuImpar.apply(2));
        System.out.println(paraOuImpar.apply(3));
        System.out.println("usando and Then");

        // o resultado do parOuImpar é passado para o oResultadoEh
        String resultadoFinal = paraOuImpar
                               .andThen(oResultadoEh)
                               .andThen(empolgado)
                               .apply(32);

        System.out.println(resultadoFinal);

    }
}
