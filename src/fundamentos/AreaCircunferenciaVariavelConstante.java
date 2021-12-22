package fundamentos;

public class AreaCircunferenciaVariavelConstante {

    public static void main(String[] args) {
        int raio = 3;
        // final é definição de constante no java
        // constantes tem por padrão o nome definido em caixa alta
        final double PI = 3.14159;
        double area = raio * PI;
        System.out.println(area);
    }
}
