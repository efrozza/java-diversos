package controle;

import java.util.Locale;

public class Switch {

    public static void main(String[] args) {

        String tipoConta = "cc";

        switch (tipoConta.toUpperCase(Locale.ROOT)) {
            case "CC":
                System.out.println("Conta corrente");
                break;
            case "CP":
                System.out.println("Conta poupança");
                break;
            default:
                System.out.println("Conta inválida");
        }

        System.out.println("o toUpperCase não alterar o valor da variavel" + tipoConta);

    }

}
