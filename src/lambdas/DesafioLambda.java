package lambdas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {

    public static void main(String[] args) {
        Produto produto = new Produto("ipad", 3235.89, 0.13);

        /*
        * 1 - A partir do produto calcular o preço real com desconto
        * 2 - Imposto Municipal: >= 2500 (8,5) < 2500 isento
        * 3 - frete >= 3000 - 1000 , < 3000 50
        * 4 - arredondar para duas casas decimais
        * */

        Function<Produto, Double> calcularPrecoPosDesconto = (produtoACalcular) -> produtoACalcular.preco -
                        (produtoACalcular.preco * produtoACalcular.desconto);

        UnaryOperator<Double> calcularImpostoMunicipal =
                        (valorParaAplicarImposto) -> valorParaAplicarImposto >= 2500 ? valorParaAplicarImposto * 0.085 : 0;

        UnaryOperator<Double> calcularValorFrete = (valorParaCalculoFrete) -> valorParaCalculoFrete >= 3000 ? 100.00 :  50.00;


        Function<Double, String> formataDoubleParaReal = (preco) -> {
            DecimalFormat df = new DecimalFormat("R$,##0.00;(R$,##0.00)");
            df.setRoundingMode(RoundingMode.HALF_UP);
            return df.format(preco);
        };

        double precoComDesconto = calcularPrecoPosDesconto.apply(produto);
        double impostoMunicipal = calcularImpostoMunicipal.apply(precoComDesconto);
        double valorDoFrete = calcularValorFrete.apply(precoComDesconto + impostoMunicipal);
        double precoFinal = precoComDesconto + impostoMunicipal + valorDoFrete;

        System.out.println("preço com desconto " + precoComDesconto);
        System.out.println("imposto municipal " + impostoMunicipal);
        System.out.println("frete " + valorDoFrete);
        System.out.println("preço final " + precoFinal);

        System.out.printf("preço com chamadas encadeadas " + formataDoubleParaReal.apply(precoFinal));

    }
}
