package lambdas;

public class CalculoTest2 {

    public static void main(String[] args) {
        // vamos implementar o que foi feito no CacultoTet usando lambda

        // o java atribui a função lambda ao metodo que recebe o mesmo número de parametros
        // e o retorno produzido pelo cormpo da função deve corresponder ao retorno do método
        // Ou seja, nesse caso deve retornar double,
        // se fizermos return "retornou" daria erro
        Calculo calc = (x, y) -> { return x + y; };
        System.out.println(calc.executar(2,3));

        // tambem podemos utilizar o return implicito para funções de uma linha
        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2,3));
    }
}
