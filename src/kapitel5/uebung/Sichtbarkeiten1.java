package kapitel5.uebung;

public class Sichtbarkeiten1 {

    private static int i2 = 12;
    private int i;

    public Sichtbarkeiten1() {
        this(i2);
        i2++;
    }

    public Sichtbarkeiten1(int i) {
        this.i = i;
        print(i);
    }

    public void print(int i) {
        System.out.println(i + 12);
    }
}
