package controle;

import javax.swing.*;

public class UsandoWhile {

    public static void main(String[] args) {
        int contador = 1;
        while ( contador <= 10 ) {
            System.out.println(contador);
            contador ++;
        }

        String comando = "";

        while (!comando.equalsIgnoreCase("sair")){
            comando = JOptionPane.showInputDialog("Digite sair para sair do programa");
        }

        // usando do While
        int valor = 0;
        do {
            System.out.println("valor " + valor);
            valor++;
        } while (valor < 10);

    }
}
