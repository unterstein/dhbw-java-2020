package kapitel4.uebung;

public class Quadrat extends Rechteck {

    static {
        System.out.println("Hi from static!");
    }

    public Quadrat() {
        super();
        System.out.println("Hi from constructor!");
    }

    public Quadrat(int laenge) {
        super(laenge, laenge);
    }

    @Override
    public void setLaenge(int laenge) {
        super.setLaenge(laenge);
        super.setBreite(laenge);
    }

    @Override
    public void setBreite(int breite) {
        super.setLaenge(breite);
        super.setBreite(breite);
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "laenge=" + getLaenge() +
                ", breite=" + getBreite() +
                '}';
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
        System.out.println("Breite: " + q2.getBreite());
        System.out.println("Laenge: " + q2.getLaenge());

        q2.setLaenge(42);
        System.out.println("Breite: " + q2.getBreite());
        System.out.println("Laenge: " + q2.getLaenge());
    }
}
