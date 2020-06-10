package kapitel6.mitarbeiter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Gehaltsberechnung {


    static Map<Integer, Mitarbeiter> mitarbeiters = new HashMap<>();

    static {
        double umsatz = 2_000_000;
        mitarbeiters.put(1, new Angestellter(1, "Horst1", 3000, 1000));
        mitarbeiters.put(2, new Angestellter(2, "Horst2", 3000, 1000));
        mitarbeiters.put(3, new Angestellter(3, "Horst3", 3000, 1000));
        mitarbeiters.put(4, new Angestellter(4, "Horst4", 3000, 1000));
        mitarbeiters.put(5, new Arbeiter(5, "Klaus1", 60, 15));
        mitarbeiters.put(6, new Arbeiter(6, "Klaus2", 260, 30));
        mitarbeiters.put(7, new Arbeiter(7, "Klaus3", 360, 31));
        mitarbeiters.put(8, new Arbeiter(8, "Klaus4", 460, 35));
        mitarbeiters.put(9, new Manager(9, "Günter1", 3500, 0.1, umsatz));
        mitarbeiters.put(10, new Manager(10, "Günter2", 3500, 0.1, umsatz));
        mitarbeiters.put(11, new Manager(11, "Günter3", 3500, 0.1, umsatz));
        mitarbeiters.put(12, new Manager(12, "Günter4", 3500, 0.1, umsatz));
        mitarbeiters.put(13, new Manager(13, "Günter5", 3500, 0.1, umsatz));
        mitarbeiters.put(14, new CEO(14, "Mark", 0, 0.2, umsatz, 5));
    }

    public static void main(String[] args) {
        double gehaltAllerMitarbeiter = berechneGehalt(mitarbeiters.values());
        System.out.println(gehaltAllerMitarbeiter);
        feature2();
    }

    static double berechneGehalt(Collection<Mitarbeiter> mitarbeiters) {
        return mitarbeiters.stream()
                .map(m -> m.berechneGehalt())
                .reduce((m1, m2) -> m1 + m2)
                .orElse(0.0);
    }

    static List<Mitarbeiter> feature1() {
        // Anforderung: Alle Arbeiter die mehr als 30 die Stunde verdienen sollen
        // ausgegeben werden
        return mitarbeiters.values().stream()
                .filter(m -> m instanceof Arbeiter)
                .map(m -> (Arbeiter) m)
                .filter(a -> a.getStundenLohn() > 30)
                .collect(Collectors.toList());
    }

    static void feature2() {
        // Anforderung: Finde Mitarbeiter mit ID 9 und gebe ihn aus
        System.out.println(getMitarbeiter(9));
    }

    public static Mitarbeiter getMitarbeiter(int personalNummer) {
        return mitarbeiters.get(personalNummer);
    }
}
