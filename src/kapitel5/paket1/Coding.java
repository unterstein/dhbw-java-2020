package kapitel5.paket1;

import kapitel4.uebung.Quadrat;
import kapitel4.uebung.Rechteck;
import kapitel5.paket2.KlasseInPaket2;

import java.awt.*;
import java.util.*;

public class Coding extends Object {

    void test() {
        new KlasseInPaket1();
        new KlasseInPaket2();

        new kapitel4.LiveCodig();

        Rechteck r = new Quadrat(5);
        String s = new String();
    }
}
