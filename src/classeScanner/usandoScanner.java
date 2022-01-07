package classeScanner;

import java.util.Scanner;

public class usandoScanner {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array");
        int size = scanner.nextInt();

        int[] grades = new int[size];

        for (int i =0; i < size; i++){
            System.out.println("Digite um valor inteiro:");
            grades[i] = scanner.nextInt();
        }

        System.out.println("Listando dados");

        for (int i =0; i < size; i++){
            System.out.println(grades[i]);
        }
        scanner.close();
    }

}
