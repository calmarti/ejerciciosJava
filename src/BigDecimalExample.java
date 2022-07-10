
import java.math.BigDecimal;

//para aplicaciones financieras usar BigDecimal, nunca float ni double

public class BigDecimalExample {
    public static void main(String[] args) {

        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(2);
        BigDecimal valorC = valorA.multiply(valorB);
        //BigDecimal valorC = valorA.add(valorB);

        System.out.println(valorC);

    }
}
