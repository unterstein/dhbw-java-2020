package kapitel6.mitarbeiter.tests;

import kapitel6.mitarbeiter.Angestellter;
import kapitel6.mitarbeiter.Arbeiter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MitarbeiterTests {

    @Test
    public void testAngestellterGehalt() {
        Angestellter angestellter = new Angestellter(123, "Horst", 2500, 700);
        assertEquals(3200, angestellter.berechneGehalt(), "Gehalt vom Angestellten nicht korrekt berechnet");
    }

    @Test
    public void testArbeiterGehalt() {
        Arbeiter arbeiter = new Arbeiter(124, "Peter", 200, 25);
        assertEquals(5000, arbeiter.berechneGehalt());
    }
}
