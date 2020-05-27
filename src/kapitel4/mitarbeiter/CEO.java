package kapitel4.mitarbeiter;

public class CEO extends Manager {
    private double ceoZulage;

    public CEO(String name, double grundGehalt, double provision, double umsatz, double ceoZulage) {
        super(name, grundGehalt, provision, umsatz);
        this.ceoZulage = ceoZulage;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt() + ceoZulage;
    }
}
