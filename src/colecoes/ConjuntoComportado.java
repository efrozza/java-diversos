package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
        //set não respeita ordem de inserção
        //set não aceita duplicidade
        //o TreeSet faz parte dos conjuntos ordenados
        // Set<String> listaAprovados = new HashSet<String>();
        Set<String> listaAprovados = new TreeSet<String>();
        listaAprovados.add("Joao");
        listaAprovados.add("Maria");
        listaAprovados.add("Pedro");

        for(String candidato :listaAprovados){
            System.out.println("Nome do aprovado " + candidato);
        }

        Set<Integer> nums = new HashSet<Integer>();

        nums.add(1);
        nums.add(120);
        nums.add(6);

        for (int num: nums){
            System.out.println(num);
        }

    }
}
