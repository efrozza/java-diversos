package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsandoGroupingByStream {

    public static void main(String[] args) {

        List<String> listaDePalavras = Arrays.asList("Ana", "Bruno", "Carols", "Maria", "Amelia", "Artemia");

        Map<Boolean, List<String>> mapaDePalavras = listaDePalavras.stream()
                .collect(Collectors.groupingBy(palavra -> palavra.startsWith("A")));

        String listaConcatenadaComSeparado = listaDePalavras.stream()
                .collect(Collectors.joining(";"));

        System.out.println(mapaDePalavras);
        System.out.println(listaConcatenadaComSeparado);
    }
}
