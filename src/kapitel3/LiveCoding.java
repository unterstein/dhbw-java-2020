package kapitel3;

import kapitel3.model.AudiQ5;
import kapitel3.model.AudiQ7;
import kapitel3.model.Pkw;
import kapitel3.model.SUV;

public class LiveCoding {

    String 異體字字典;

    // 異體字字典

    public static void main(String[] args) {
        // short, int, long
        short s = 2;
        int i = s;
        short s2 = (short) i;
        int i2 = Integer.MAX_VALUE - 200;
        System.out.println(i2);
        System.out.println((short) i2);

        AudiQ5 q5 = new AudiQ5();
        System.out.println(q5);
        SUV suv = q5;
        System.out.println(suv);
        Pkw pkw = q5;
        System.out.println(pkw);
        AudiQ5 zweiterQ5 = (AudiQ5) pkw;
        System.out.println(zweiterQ5);

        Pkw pkw2 = new AudiQ7();
        if (pkw2 instanceof AudiQ5) {
            AudiQ5 dritterQ5 = (AudiQ5) pkw2;
            System.out.println(dritterQ5);
        }
    }
}
