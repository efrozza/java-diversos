package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OperacoesFinaisStream {


    // apos uma operacao final não é mais possivel fazer nada sob esse Stream
    // referencia https://www.youtube.com/watch?v=1febjDMVMnc

    public static void main(String[] args) {

        List<Integer> listaNumeros = Arrays.asList(1,5,4,8,9,7,9);

        Optional<Integer> count = listaNumeros.stream()
                //.limit(3)
                //.filter((e) -> e % 2 == 0)
                .min(Comparator.naturalOrder());
               // .max(Comparator.naturalOrder())
                //.count();

        System.out.println(count.get());

    }
}
