package kapitel5.uebung;

public class Sichtbarkeiten2 extends Sichtbarkeiten1 {
    private int i2 = 1;
    private static int i;

    public Sichtbarkeiten2() {
    }

    public Sichtbarkeiten2(int i2) {
        this.i2 = i2;
    }

    @Override
    public void print(int i) {
        System.out.println(this.i + i);
    }

    public static void main(String[] args) {
        new Sichtbarkeiten2();
        new Sichtbarkeiten1();
    }
}
