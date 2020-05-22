package kapitel4.uebung;

public class Rechteck {
    private int laenge;
    private int breite;

    public Rechteck() {
    }

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    int berechneUmfang() {
        return 2 * laenge + 2 * breite;
    }


    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }
}
