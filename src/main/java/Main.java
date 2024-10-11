import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("4673264823974.43267463248934");
        System.out.println(decimal.pow(1000));
    }
}