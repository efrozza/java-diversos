package numeros;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class MoneyCalculation {

    /**
     * Simple test harness.
     * <p>
     * Takes two numeric arguments, representing monetary values, in a form
     * which can be passed successfully to the <tt>BigDecimal(String)</tt>
     * constructor (<code>25.00, 25.0, 25</code>, etc).
     * <p>
     * Note that the <code>String</code> constructor is preferred for
     * <code>BigDecimal</code>.
     */
    public static void main(String... args) {
        BigDecimal amountOne = new BigDecimal(args[0]);
        BigDecimal amountTwo = new BigDecimal(args[1]);
        MoneyCalculation calc = new MoneyCalculation(amountOne, amountTwo);
        calc.doCalculations();
    }

    public MoneyCalculation(BigDecimal amountOne, BigDecimal amountTwo) {
        this.amountOne = rounded(amountOne);
        this.amountTwo = rounded(amountTwo);
    }

    public void doCalculations() {
        log("Amount One: " + amountOne);
        log("Amount Two: " + amountTwo);
        log("Sum : " + getSum());
        log("Difference : " + getDifference());
        log("Average : " + getAverage());
        log("5.25% of Amount One: " + getPercentage());
        log("Percent Change From Amount One to Two: " + getPercentageChange());
    }

    // PRIVATE

    private BigDecimal amountOne;
    private BigDecimal amountTwo;

    /**
     * Defined centrally, to allow for easy changes to the rounding mode.
     */
    private static RoundingMode ROUNDING_MODE = RoundingMode.HALF_EVEN;

    /**
     * Number of decimals to retain. Also referred to as "scale".
     */
    private static int DECIMALS = 2;
    //An alternate style for this value :
    //private static int DECIMAL_PLACES =
    //  Currency.getInstance("USD").getDefaultFractionDigits()
    //;

    private static int EXTRA_DECIMALS = 4;
    private static final BigDecimal TWO = new BigDecimal("2");
    private static BigDecimal HUNDRED = new BigDecimal("100");
    private static BigDecimal PERCENTAGE = new BigDecimal("5.25");

    private void log(String text) {
        System.out.println(Objects.toString(text));
    }

    private BigDecimal getSum() {
        return amountOne.add(amountTwo);
    }

    private BigDecimal getDifference() {
        return amountTwo.subtract(amountOne);
    }

    private BigDecimal getAverage() {
        return getSum().divide(TWO, ROUNDING_MODE);
    }

    private BigDecimal getPercentage() {
        BigDecimal result = amountOne.multiply(PERCENTAGE);
        result = result.divide(HUNDRED, ROUNDING_MODE);
        return rounded(result);
    }

    private BigDecimal getPercentageChange() {
        BigDecimal fractionalChange = getDifference().divide(
                amountOne, EXTRA_DECIMALS, ROUNDING_MODE
        );
        return rounded(fractionalChange.multiply(HUNDRED));
    }

    private BigDecimal rounded(BigDecimal number) {
        return number.setScale(DECIMALS, ROUNDING_MODE);
    }
}
