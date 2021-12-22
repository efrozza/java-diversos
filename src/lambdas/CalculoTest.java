package lambdas;

public class CalculoTest {

    public static void main(String[] args) {
        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2,3));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(2,3));

        // como as duas classes, Somar e Multiplicar implementam Calculo
        // podemos dar new de Calculo para as duas

    }
}
