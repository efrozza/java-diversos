package streams;

import java.util.Arrays;
import java.util.List;

// referencia

public class UsandoDistinct {

    public static void main(String[] args) {

        List<Integer> listaInteiros = Arrays.asList(1, 2, 2, 3, 7, 8);

        Integer primeiroDiferente = listaInteiros.stream()
                .distinct()
                .findFirst().get();

        System.out.println(primeiroDiferente);
    }

}
