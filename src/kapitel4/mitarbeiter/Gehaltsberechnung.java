package kapitel4.mitarbeiter;

public class Gehaltsberechnung {
    public static void main(String[] args) {
        double umsatz = 2_000_000;

        Mitarbeiter[] mitarbeiters = new Mitarbeiter[4];
        mitarbeiters[0] = new Angestellter("Horst", 3000, 1000);
        mitarbeiters[1] = new Arbeiter("Klaus", 160, 15);
        mitarbeiters[2] = new Manager("Günter", 3500, 0.1, umsatz);
        mitarbeiters[3] = new CEO("Mark", 0, 0.2, umsatz, 5);
        double gehaltAllerMitarbeiter = berechneGehalt(mitarbeiters);
        System.out.println(gehaltAllerMitarbeiter);
    }

    static double berechneGehalt(Mitarbeiter[] mitarbeiters) {
        double ergebnis = 0.0;

        for (Mitarbeiter mitarbeiter : mitarbeiters) {
            ergebnis += mitarbeiter.berechneGehalt();
        }

        return ergebnis;
    }
}
