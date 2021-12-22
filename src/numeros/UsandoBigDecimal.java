package numeros;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsandoBigDecimal {

    public static void main(String[] args) {
        // exemplo de problema usando double
        // NÃO USAR DOUBLE PARA precisão decimal

        double a = 0.03;
        double b = 0.04;
        double c = b - a;

        System.out.println("Problema do uso de double para valores " + c);

        // ATENCAOO - SEMPRE PASSAR STRING PARA O CONSTRUTOR DO BIGDECIMAL
        // PARA NAO TERMOS PROBLEMAS COM PRECISAO

        BigDecimal resultadoSemPrecisao = new BigDecimal(b).subtract(new BigDecimal(a));
        System.out.println("Problema do uso de BigDecicmal passando double como parametro " + resultadoSemPrecisao);

        BigDecimal resultadopreciso2 = new BigDecimal(Double.toString(b)).subtract(new BigDecimal(Double.toString(a)));
        System.out.println("Convertendo double para BigDecimal passando String para ter resultado ok " + resultadopreciso2);

        // Para trabalhar com valores de alta precisão vamos usar BigDecimal
        // setScale para setar a precisao decimal
        // RoundingMode para definir o arredondamento
        // UP - para cima
        // DOWN - para baixo
        // CEILING - se o numero for positivo arredonda pra UP se for negativo DOWN
        // FLOOR - contrario do CEILING


        BigDecimal _a = new BigDecimal("0.03").setScale(2, RoundingMode.CEILING);
        BigDecimal _b = new BigDecimal("0.04").setScale(2, RoundingMode.CEILING);
        BigDecimal _c = _b.subtract(_a).setScale(2,RoundingMode.CEILING);

        //_c = BigDecimal.valueOf(b - a);

        System.out.println("Calculo exato com bigDecimal " + _c);

        // QUANDO FORMOS CRIAR ENTIDATES NO JPA devemos definir os campos
        // que serão usados em cáculos como BigDecimal

        // Náo podemos usar operadores aritmeticos para manipular classes
        // Vamos usar os métodos do big decimal

        BigDecimal resultado = _a.multiply(_b);
        System.out.println("multiplica " + resultado);
        resultado = _a.subtract(_b);
        System.out.println("subtrai " + resultado);
        resultado = _a.add(_b);
        System.out.println("soma " + resultado);
        resultado = _a.divide(_b, RoundingMode.CEILING);
        System.out.println("divide " + resultado);

        // Para converter para tipos primitivos a parte fracionaria é descartada
        // Não há arredondamento

        int bigDecimalConvertidoParaInt = resultado.intValue();
        System.out.println("big Decimal convertido" + resultado + " covnertido em int " + bigDecimalConvertidoParaInt);

        double bigDecimalConvertidoParaDouble = resultado.doubleValue();
        System.out.println("big Decimal convertido" + resultado + " covnertido em double " + bigDecimalConvertidoParaDouble);

        // COMO COMPARAR VALROES
        // NUNCA USAR O EQUALs
        // vamos usar compareTo

        if (_a.compareTo(_b) < 0){
            System.out.println("A é menor que B " + _a + " " + _b);
        }

        if (_a.compareTo(_b) == 0){
            System.out.println("A é igual que B" + _a + " " + _b);
        }

        if (_a.compareTo(_b) > 0){
            System.out.println("A é maior que B" + _a + " " + _b);
        }

        if (_a.compareTo(_b) != 0){
            System.out.println("A é diferente de B " + _a + " " + _b);
        }

    }
}
