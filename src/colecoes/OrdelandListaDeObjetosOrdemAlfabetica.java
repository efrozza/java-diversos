package colecoes;


import java.text.Collator;
import java.util.*;

public class OrdelandListaDeObjetosOrdemAlfabetica {



    public static void main(String[] args) {
        List<Aula> aulas = new ArrayList<>();

        Aula a1 = new Aula("Lean Digital", 1);
        Aula a2 = new Aula("Lean ?gil", 1);
        aulas.add(a1);
        aulas.add(a2);

        aulas.forEach((aula -> System.out.println(aula.getTitulo())));

        Collections.sort(aulas, new Comparator<Aula>() {

            public int compare(Aula o1, Aula o2) {
                Collator collator = Collator.getInstance(new Locale("pt", "BR"));
                return collator.compare(o1.getTitulo(), o2.getTitulo());
            }
        });

        aulas.forEach((aula -> System.out.println(aula.getTitulo())));
    }

}
