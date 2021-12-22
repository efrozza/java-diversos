package arrays;

public class TestandoArrays {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        for (String elemento: vetor.getElementos()){
            System.out.println(elemento);
        }

    }
}
