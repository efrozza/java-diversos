package classesemetodos;

public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!"));

        String s2 = null;
        // gerando erro de execução null pointer
        System.out.println(s2.concat("teste"));
    }
}
