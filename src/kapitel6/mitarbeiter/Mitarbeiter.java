package kapitel6.mitarbeiter;

public abstract class Mitarbeiter {
    private int personalNummer;
    private String name;

    public Mitarbeiter(int personalNummer, String name) {
        this.personalNummer = personalNummer;
        this.name = name;
    }

    public int getPersonalNummer() {
        return personalNummer;
    }

    public String getName() {
        return name;
    }

    public abstract double berechneGehalt();

    @Override
    public String toString() {
        return name;
    }
}
