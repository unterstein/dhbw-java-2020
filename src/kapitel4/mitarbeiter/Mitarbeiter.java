package kapitel4.mitarbeiter;

public abstract class Mitarbeiter {
    private int personalNummer;
    private String name;

    public Mitarbeiter(String name) {
        this.name = name;
    }

    public abstract double berechneGehalt();
}
