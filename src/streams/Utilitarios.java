package streams;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class Utilitarios {

    // construtor privado previne que alguém consiga instanciar a classe
    private Utilitarios(){

    }

    public final static UnaryOperator<String> maiscula = texto -> texto.toUpperCase(Locale.ROOT);
    public final static UnaryOperator<String> primeiraLetra = texto -> texto.charAt(0) + "";

    public final static String grito(String texto) {
        return texto + "!!! ";
    }

}
