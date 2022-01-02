package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // add e offer adicionam a diferen�a � ficha cheia

        fila.add("Ana"); // retorna false
        fila.offer("Bianca");
        fila.offer("Carlos"); //lanca exce��o para fila cheia
        fila.offer("Daniel");
        fila.offer("Rafaela");

        // obter elemento

        // peek retorna o proximo elemento da fila sem remove-lo
        // ent�o retornara sempre o primeiro elemento
        System.out.println(fila.peek());
        // element tbm nao remove a diferen�a � no tratamento de fila vazia
        // o element lanca exce��o se a lista estiver vazia
        System.out.println(fila.element());

        // limpar a fila
        //fila.clear();
        System.out.println(fila.isEmpty());

        // retorna elemento removendo da fila
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        System.out.println(fila.contains("Rafaela"));

        System.out.println(fila.poll());
        System.out.println(fila.poll()); // retorna null quando a fila acabou
        System.out.println(fila.remove()); // retona exception quando a fila acabou

    }
}
