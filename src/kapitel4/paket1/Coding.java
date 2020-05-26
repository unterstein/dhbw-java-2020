package kapitel4.paket1;

import kapitel4.LiveCoding;
import kapitel4.uebung.Quadrat;
import kapitel4.uebung.Rechteck;
import kapitel4.paket2.KlasseInPaket2;

public class Coding extends Object {

    void test() {
        new KlasseInPaket1();
        new KlasseInPaket2();

        new LiveCoding();

        Rechteck r = new Quadrat(5);
        String s = new String();
    }
}
