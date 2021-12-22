package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        // Supllier não aceita parametros de entrada
        // Supllier não tem concatenação de funções
        Supplier<List<String>> umaLista = () -> Arrays.asList("ana", "bia", "lia", "gui");
        System.out.println(umaLista.get());
    }
}
