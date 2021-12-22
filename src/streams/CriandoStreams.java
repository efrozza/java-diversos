package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        // criando stream
        Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
        langs.forEach(print);

        // declarando array
        String[] maisLangs = {"Python ", "Cobol ", "Lisp ", "Perl\n"};
        // passando o array pra Stream e ja encadeando com forEach
        Stream.of(maisLangs).forEach(print);
        // usando Arrays.util
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        // criando Stream a partir de collections

        List<String> outrasLangs = new ArrayList<>();
        outrasLangs.add("ruby ");
        outrasLangs.add("Csharp ");
        outrasLangs.add("Fortran");

        Stream.of(outrasLangs.toString()).forEach(print);
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // generate gera um stream que não para de executar
        // passando um suplier - lambda é um função q não recebe parametro
        //Stream.generate(() -> "A").forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(println);


    }
}
