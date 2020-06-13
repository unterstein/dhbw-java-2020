package kapitel6;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class LiveCoding {
    public static void main(String[] args) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException {
        Random generator = new Random();
        for (int i = 0; i < 100; i++) {
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

//        Runtime.getRuntime().exec("touch /Users/junterstein/Desktop/test2/test");

        System.out.println(LocalDate.now());
        LocalDate today = LocalDate.of(10, 8, 7);
        System.out.println(today);
        LocalTime time = LocalTime.of(18, 23);
        System.out.println(time);
        LocalDateTime localDateTime = today.atTime(time);
        localDateTime = localDateTime.plusDays(5000);
        System.out.println(localDateTime);


//        File f = new File("mein-pfad");
//        f.delete();
//        new File("ordner2/ordner3/ordner4").mkdirs();
        File java2020 = File.createTempFile("java2020", ".txt");
        System.out.println(java2020.getAbsolutePath());
        System.out.println(System.getProperty("java.io.tmpdir"));


        Thread t1 = new Thread(){
            @Override
            public void run() {
                while(true) {
                    System.out.println("hey!");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("ho!");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread(r);
        t2.start();
        System.out.println("HI FROM MAIN THREAD");
    }
}
