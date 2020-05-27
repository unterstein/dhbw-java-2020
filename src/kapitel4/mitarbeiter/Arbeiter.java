package kapitel4.mitarbeiter;

public class Arbeiter extends Mitarbeiter {
    private double stunden;
    private double stundenLohn;

    public Arbeiter(String name, double stunden, double stundenLohn) {
        super(name);
        this.stunden = stunden;
        this.stundenLohn = stundenLohn;
    }

    @Override
    public double berechneGehalt() {
        return stunden * stundenLohn;
    }
}
