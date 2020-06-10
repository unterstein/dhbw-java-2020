package kapitel6.mitarbeiter;

public class Angestellter extends Mitarbeiter{
    private double grundGehalt;
    private double zulage;

    public Angestellter(int personalNummer, String name, double grundGehalt, double zulage) {
        super(personalNummer, name);
        this.grundGehalt = grundGehalt;
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return grundGehalt + zulage;
    }
}
