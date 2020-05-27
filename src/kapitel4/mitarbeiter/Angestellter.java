package kapitel4.mitarbeiter;

public class Angestellter extends Mitarbeiter{
    private double grundGehalt;
    private double zulage;

    public Angestellter(String name, double grundGehalt, double zulage) {
        super(name);
        this.grundGehalt = grundGehalt;
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return grundGehalt + zulage;
    }
}
