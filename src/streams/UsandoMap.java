package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsandoMap {

    // O map transforma os dados em uma copia da lista
    // a ista original, não é modificada

    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        // construiir a stream
        marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);

        System.out.println("\nusando composicao");
        marcas.stream()
                .map(Utilitarios.maiscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);

    }
}
