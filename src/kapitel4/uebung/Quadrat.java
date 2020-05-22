package kapitel4.uebung;

public class Quadrat extends Rechteck {

    public Quadrat() {
        super();
    }

    public Quadrat(int laenge) {
        super(laenge, laenge);
    }

    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(7, 4);
        System.out.println(r1.berechneUmfang());
        Rechteck r2 = new Rechteck();
        r2.setBreite(4);
        r2.setLaenge(7);
        System.out.println(r2.berechneUmfang());

        Quadrat q = new Quadrat(5);
        System.out.println(q.berechneUmfang());

        Quadrat q2 = new Quadrat(10);
        q2.setBreite(5);
    }
}
