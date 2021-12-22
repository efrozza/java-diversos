package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsandoCollectStream {

    public static void main(String[] args) {

        List<Integer> listaNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> novaLista = listaNumber.stream()
                .filter((integer -> integer % 2 == 0))
                .map(e -> e * 3)
                .collect(Collectors.toList());

        for (Integer i: novaLista) {
            System.out.println(i);
        }

    }

}
