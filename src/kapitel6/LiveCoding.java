package kapitel6;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class LiveCoding {
    public static void main(String[] args) throws IOException {
        Random generator = new Random();
        for (int i = 0; i<100;i++) {
            System.out.println(generator.nextDouble());
        }

        Date d = new Date(120, 8, 7);

        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.lineSeparator());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        BigInteger bigInt1 = new BigInteger("1000000000000000000000");
        bigInt1.add(new BigInteger("1000000000000000000000"));
        System.out.println(bigInt1);
        BigDecimal bigDecimal1 = new BigDecimal("0.000000000000000000000000000001");
        bigDecimal1.add(new BigDecimal("0.000000000000000000000000000001"));
        System.out.println(bigDecimal1);

        Runtime.getRuntime().exec("touch /Users/junterstein/Desktop/test2/test");
    }
}
