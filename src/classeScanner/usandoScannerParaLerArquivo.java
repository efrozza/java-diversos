package classeScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class usandoScannerParaLerArquivo {

    public static void main(String[] args) throws FileNotFoundException {

        final Scanner scanner = new Scanner(new File("C:\\arquivo.txt"));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        final String helo = "Helo";
        String another = "testes";
        scanner.close();
    }

}

