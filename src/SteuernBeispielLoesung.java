public class SteuernBeispielLoesung {

    // Regeln für Steuerberechnung:
    // monatliches Einkommen:
    // < 2000 => 15%
    // < 3000 => 20%
    // < 4000 => 30%
    // < 5000 => 35%
    // >= 5000 => 40%
    public static void main(String[] args) {
        // Teil 1
        // Eingabe:
        double einzelGehalt = 2000;
        // Ausgabe: gezahlte Steuern
        System.out.println(steuerSumme(einzelGehalt));

        // Teil 2
        // Eingabe:
        double[] gehaeltern = {2000, 1234, 1238, 7261, 1238};

        double summe = 0;
        for (double gehalt: gehaeltern) {
            summe += steuerSumme(gehalt);
        }

        System.out.println(summe);

        // Ausgabe: Summe aller gezahlten Steuern
    }

    static double steuerSumme(double gehalt) {
        if (gehalt < 2000) {
            return gehalt * 0.15;
        } else if (gehalt < 3000) {
            return gehalt * 0.2;
        } else if (gehalt < 4000) {
            return gehalt * 0.3;
        } else if (gehalt < 5000) {
            return gehalt * 0.35;
        } else
            return gehalt * 0.4;
    }
}
