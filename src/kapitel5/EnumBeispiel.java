package kapitel5;

import java.util.Arrays;

public class EnumBeispiel {

    public static void main(String[] args) {
        Farbe gelb = Farbe.GELB;
        Farbe blau = Farbe.valueOf("BLAU");

        System.out.println(gelb);
        System.out.println(blau);

        System.out.println(Arrays.toString(Farbe.values()));

    }

    enum Farbe {
        ROT(255, 0, 0), GELB(0, 255, 0), BLAU(0, 0, 255);

        private int r, g, b;

        private Farbe(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Farbe{" +
                    "r=" + r +
                    ", g=" + g +
                    ", b=" + b +
                    "} " + super.toString();
        }
    }
}
