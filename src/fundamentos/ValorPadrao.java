package fundamentos;

public class ValorPadrao {

    int b;

    public static void main(String[] args) {
        // valores primitos numericos tem valor inical 0
        // double float te valor padrao 0.o
        // boolean - false
        // char - primeiro unicode = \u0000
        // Object = null

        // ATENCAO - variaveis locais nao sao inicializadas por padrao
        // veja que a variavel b , q eh variavel de classe não precisou ser inicializada
        int i = 5;
        System.out.println(i);

        ValorPadrao valorPadrao = new ValorPadrao();
        System.out.println("Imprime valor padrao da variavel de classeb " + valorPadrao.b);

    }


}
