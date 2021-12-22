package streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class UsandoCollect {

    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("1000.01");
        BigDecimal num2 = new BigDecimal("2000.01");
        BigDecimal num3 = new BigDecimal("3000.02");

        List<BigDecimal> precos = Arrays.asList(num1, num2, num3);

        DoubleSummaryStatistics stats = precos.stream()
                .collect(Collectors.summarizingDouble(n -> n.doubleValue()));

        System.out.println("Double Statistics");
        System.out.println("Total de elmentos " + stats.getCount());
        System.out.println("Maior valor da lista " + stats.getMax());
        System.out.println("Menor valor da lista " + stats.getMin());
        System.out.println("Soma de todos os itens da lista " + stats.getSum());
        System.out.println("Media dos valores " + stats.getAverage());

        Long count = precos.stream()
                .filter((n) -> new BigDecimal("1500.00").compareTo(n) < 0)
                .collect(Collectors.counting());

        System.out.println(count);


    }

}
