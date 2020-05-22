package kapitel3;

public class WochenTagBerechnung {

    static int[] tageImMonat;

    public static void main(String[] args) {
        init();
        System.out.println(wochenTag(1, 1, 1990)); // Montag
        System.out.println(wochenTag(1, 1, 1900)); // Montag
        System.out.println(wochenTag(4, 4, 2010)); // Sonntag
        System.out.println(wochenTag(8, 4, 2007)); // Sonntag
        System.out.println(wochenTag(1, 3, 2006)); // Mittwoch
        System.out.println(wochenTag(21, 2, 2007)); // Mittwoch
        System.out.println(wochenTag(17, 2, 2010)); // Mittwoch
        System.out.println(wochenTag(21, 5, 2020)); // Donnerstag
    }

    static String wochenTag(int tag, int monat, int jahr) {
        int ergebnis = (jahr - 1900) * 365; // Tage pro Jahr
        ergebnis += (jahr - 1900) / 4; // Schaltjahre dazu
        if (jahr > 1900 && (jahr - 1900) % 4 == 0 && monat <= 2) { // Falls aktuelles Jahr Schaltjahr und Monat Jan/Feb, eins weg
            ergebnis--;
        }
        for (int i = 1; i < monat; i++) { // Tage der Monate dazu
            ergebnis += tageImMonat[i];
        }
        ergebnis += tag;
        switch (ergebnis % 7) {
            case 0:
                return "Sonntag";
            case 1:
                return "Montag";
            case 2:
                return "Dienstag";
            case 3:
                return "Mittwoch";
            case 4:
                return "Donnerstag";
            case 5:
                return "Freitag";
            case 6:
                return "Samstag";
            default:
                return "¯\\_(ツ)_/¯";
        }
    }

    private static void init() {
        tageImMonat = new int[13]; // Es gibt keine 0!
        tageImMonat[1] = 31;
        tageImMonat[2] = 28;
        tageImMonat[3] = 31;
        tageImMonat[4] = 30;
        tageImMonat[5] = 31;
        tageImMonat[6] = 30;
        tageImMonat[7] = 31;
        tageImMonat[8] = 31;
        tageImMonat[9] = 30;
        tageImMonat[10] = 31;
        tageImMonat[11] = 30;
        tageImMonat[12] = 31;
    }
}
