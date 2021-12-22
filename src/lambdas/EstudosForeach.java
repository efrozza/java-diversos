package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EstudosForeach {

    public static void main(String[] args) {

        List<String> reprovados = new ArrayList<>();

        reprovados.add("João");
        reprovados.add("Maria");

        reprovados.forEach((nomeReprovado) -> {
            System.out.println(nomeReprovado);
        });

        // forma mais simples de inicializar um array, usando o java util Arrays

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println("Forma tradicional");

        for (String nome : aprovados){
            System.out.println("Aprovado " + nome);
        }

        // podemos passar um função lambda para cada elemento retornado na lista
        System.out.println("Lambda 1");
        aprovados.forEach((nome) -> {
            System.out.println("Nome do lambada " + nome);
        });

        System.out.println("Lambda 2");
        aprovados.forEach(nome -> {meuImprimir(nome);
        });

        System.out.println("\nMethod Reference 1" );
        // passando o println como parametro para o forEach
        aprovados.forEach(System.out::println);

        System.out.println("\nMethod Reference 2");
        // Passando o metodo meuImprimir da classe EstudosForEach como parametro para o forEach
        aprovados.forEach(EstudosForeach::meuImprimir);
    }

    static void meuImprimir (String nome){
        System.out.println("Oi! Meu nome é " + nome);
    }
}
