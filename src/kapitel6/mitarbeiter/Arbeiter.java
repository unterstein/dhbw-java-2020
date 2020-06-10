package kapitel6.mitarbeiter;

public class Arbeiter extends Mitarbeiter {
    private double stunden;
    private double stundenLohn;

    public Arbeiter(int personalNummer, String name, double stunden, double stundenLohn) {
        super(personalNummer, name);
        this.stunden = stunden;
        this.stundenLohn = stundenLohn;
    }

    public double getStundenLohn() {
        return stundenLohn;
    }

    @Override
    public double berechneGehalt() {
        return stunden * stundenLohn;
    }
}
