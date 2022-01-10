package textos;

public class RemoveEspacoInicioFimDaString {

    public static String removerEspacosSemTrim (final String frase){

        char[] charsDaFrase = frase.toCharArray();
        int inicio = 0;
        int fim = charsDaFrase.length - 1;
        int totalLetrasDaFrase;

        inicio = getInicioFrase(charsDaFrase, inicio);
        fim = getFimFrase(charsDaFrase, inicio, fim);
        totalLetrasDaFrase = fim - inicio + 1;

        String result = new String(charsDaFrase, inicio, totalLetrasDaFrase);
        
        return result;

    }

    public static String removerEspacosComTrim (final String frase){
        return frase.trim();
    }

    private static int getInicioFrase(char[] charsDaFrase, int inicio) {
        for (int i = 0; i < charsDaFrase.length; i ++){
            if (charsDaFrase[i] != ' '){
                inicio = i;
                break;
            }
        }
        return inicio;
    }

    private static int getFimFrase(char[] charsDaFrase, int inicio, int fim) {
        for (int i = charsDaFrase.length - 1; i > inicio - 1; i--){
            if (charsDaFrase[i] != ' '){
                fim = i;
                break;
            }
        }
        return fim;
    }

}
