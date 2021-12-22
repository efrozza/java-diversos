package fundamentos;

public class Operadores {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 < 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);

        // operador ternario

        double media = 7.6;
        String resultado = media >= 7.0 ? "aprovado" : "recuperacao";
        System.out.println("o aluno está " + resultado) ;

        int testeLogico = 4 < 5 ? 1 : 0;
        System.out.println("Teste logico " + testeLogico

        );


    }

}
