package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        // Celsius para fahrenheit

        final int AJUSTE_CONVERSAO_FAHRENHEIT = 32;
        final double FATOR_DIVISAO_FAHRENHEIT = 5.0 / 9.0;

        double temperaturaFahrenheit = 86;
        double temperaturalCelcius = (temperaturaFahrenheit - AJUSTE_CONVERSAO_FAHRENHEIT) * FATOR_DIVISAO_FAHRENHEIT;
        System.out.println(temperaturalCelcius);

    }
}
