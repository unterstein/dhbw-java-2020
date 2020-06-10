package kapitel6.mitarbeiter;

public class Manager extends Mitarbeiter {
    private double grundGehalt;
    private double provision;
    private double umsatz;

    public Manager(int personalNummer, String name, double grundGehalt, double provision, double umsatz) {
        super(personalNummer, name);
        this.grundGehalt = grundGehalt;
        this.provision = provision;
        this.umsatz = umsatz;
    }

    @Override
    public double berechneGehalt() {
        return grundGehalt + provision * umsatz;
    }
}
