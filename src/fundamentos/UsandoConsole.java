package fundamentos;

import java.util.Scanner;

public class UsandoConsole {

    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");
        System.out.println("Apos barra n");

        System.out.printf("Números aleatorios %d %d %d %n", 1, 2, 3);
        System.out.printf("Console com casas decimais %.2f", 1234.456);
        System.out.printf("Consome com String %s %n", "String concat");

        // Capturando dados de entrada
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Nome digitado " + nome);
    }
}
