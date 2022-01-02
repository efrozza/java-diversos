package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaDeque {

    public static void main(String[] args) {
        //LIFO

        Deque<String> livros = new ArrayDeque<String>();
        livros.add("O pequeno principe");
        livros.push("Don Quixote");
        livros.push("O hobbit");

        // obtem o proximo item da pila sem remover
        System.out.println(livros.peek());
        System.out.println(livros.element());

        // obtem o proximo item da pilha removendo
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

        System.out.println(livros.isEmpty());
        System.out.println(livros.contains("Don Quixote"));
        System.out.println(livros.pop());
        System.out.println(livros.remove());
    }
}
