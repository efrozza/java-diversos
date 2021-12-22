package fundamentos;

public class ErroPontoFluanteNoJava {

    public static void main(String[] args) {

        // o java tem problemas de precisao usando float e double

        float valorFloat = 0.2F;
        double valorDouble = 0.2;

        if (valorDouble == valorFloat) {
            System.out.println("Valores iguais");
        } else {
            System.out.println("Valores diferentes");
        }

    }
}
