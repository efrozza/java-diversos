package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        // A interface funcional Consumer recebe um único parametro e não retorna nada

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.39, 0.09);
        Produto p2 = new Produto("Borracha", 1.39, 0.08);
        Produto p3 = new Produto("Lápis", 1.39, 0.08);

        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1,p2,p3);

        // o forEach já está preparado para receber um Consumer
        // sendo assim ele sabe que tem que chamar o accept em cada iteração
        produtos.forEach(imprimir);

        // passando a lambda no forEach
        produtos.forEach(p -> System.out.println(p.preco));

        // chamando como referencia de metodo da o println ele já está recebendo o produto do for each
        produtos.forEach(System.out::println);
    }
}
