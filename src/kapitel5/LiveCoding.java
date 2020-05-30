package kapitel5;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.nio.file.AccessDeniedException;

public class LiveCoding {
    public static void main(String[] args) throws FileNotFoundException, AccessDeniedException {
        String s = new String();
        s = String.valueOf(s);

        String s2 = "";
        s = new String(s2);
        System.out.println("    a   ".trim());
        String regex = "abcdefg123";
        System.out.println(regex.replaceAll("([a-zA-Z])", "Zahl"));
        String statisch = "statisch";
        System.out.println(statisch);
        statisch = statisch.substring(3);
        System.out.println(statisch);

        String result = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            result += i;
            builder.append(i);
        }
        System.out.println(result);

        try {
            // Meine fachliche Logik!
            tueEtwas();

            // hier noch viel mehr Logik!
        } catch (FileNotFoundException e) {
            // Separate Fehlerbehandlung
            e.printStackTrace();
            // hier code für Reparatur!
        } catch (AccessDeniedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // hier ganz viel code um Gehalt an Mitarbeiter zu überweisen!
        System.out.println("Gehalt überwiesen an Mitarbeiter");
        try {
            tueEtwas2();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        // Hier wird Gehalt für die DHBW Studenten überwiesen
        System.out.println("Gehalt überwiesen an DHBW Studenten");

        try {
            tueEtwas2();
        } catch (Exception e) {
        } finally {
            System.out.println("finally");
        }

        System.out.println(uebung());

        try {

        } finally {

        }

        System.out.println("pre");
        tueEtwasMitRuntimeException();
        System.out.println("post");
    }

    static void tueEtwasMitRuntimeException() throws RuntimeException {
        throw new MeineEigeneException("Hi");
    }


    static int uebung() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    static void tueEtwas2() throws FileNotFoundException, AccessDeniedException {
        tueEtwas();
    }

    static void tueEtwas()
            throws FileNotFoundException, AccessDeniedException {
        throw new FileNotFoundException("Hi!");
    }
}
