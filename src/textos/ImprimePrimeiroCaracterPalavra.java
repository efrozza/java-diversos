package textos;

public class ImprimePrimeiroCaracterPalavra {

    private String frase;

    ImprimePrimeiroCaracterPalavra(String frase) {
        this.frase = frase;
    }

    public void execute() {

        // transforma uma String em um array de char
        char[] caracteresDaFrase = this.getFrase().toCharArray();

        for (int i = 0; i < caracteresDaFrase.length; i++) {
            if (caracterDiferenteDeEspaco(caracteresDaFrase[i]) &&
               (ehOPrimeiroCaracterDaFrase(i) || caracterAnteriorIgualEspaco(caracteresDaFrase[i - 1]))) {
                imprimir(caracteresDaFrase[i]);
            }
         }

    }

    private String getFrase() {
        return frase;
    }

    private static void imprimir(char x) {
        System.out.println(x);
    }

    private static boolean ehOPrimeiroCaracterDaFrase(int i) {
        return i == 0;
    }

    private static boolean caracterDiferenteDeEspaco(char c) {
        return c != ' ';
    }

    private static boolean caracterAnteriorIgualEspaco(char c) {
        return c == ' ';
    }
}
