package streams;

import java.util.Arrays;
import java.util.List;

public class UsandoSkipLimit {

    public static void main(String[] args) {

        List<String> listaNomes = Arrays.asList("Ana", "Bruno", "Pedro", "Maria");

        listaNomes.stream()
                .skip(1)
                .limit(2)
                .forEach((e) -> System.out.println(e));
    }
}
