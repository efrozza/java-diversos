package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        // A inteface funcional Predicate, recebe um parametro e devolve true ou false

        Predicate<Produto> isCaro = prod -> (prod.preco *  (1 - prod.desconto) ) > 500.00;

        Produto produto = new Produto("Notebook", 1000.00, 0.4);
        System.out.println(isCaro.test(produto));
    }



}
