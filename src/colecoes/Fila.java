package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // add e offer adicionam a diferença é ficha cheia

        fila.add("Ana"); // retorna false
        fila.offer("Bianca");
        fila.offer("Carlos"); //lanca exceção para fila cheia
        fila.offer("Daniel");
        fila.offer("Rafaela");

        // obter elemento

        // peek retorna o proximo elemento da fila sem remove-lo
        // element tbm a diferença é no tratamento de fila vazia
        System.out.println(fila.peek());
        System.out.println(fila.element());
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
