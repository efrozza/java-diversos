package lambdas;

import java.util.Optional;

public class UsandoOptional {

    public static void main(String[] args) {
        String s = "1";
        converterEmNumero(s).ifPresent(n -> System.out.println(n));;

        Integer numero = converterEmNumero(s).orElse(0);
        //System.out.println(numero.isPresent());
        // se chamar o get sem testar o isPresent vai retornar exceção
        //System.out.println(numero.get());


    }

    public static Optional<Integer> converterEmNumero (String numStr){

        try {
            Integer value = Integer.valueOf(numStr);
            return Optional.of(value);
        } catch (Exception e){
            return Optional.empty();
        }
    }
}
