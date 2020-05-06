public class ErsteKlasse {
    public static void main(String[] args) {
        System.out.println("Hallo!");

        int zahl;
        zahl = 12;

        int zahl2 = 10;
        System.out.println(zahl2);
        zahl2 = 11;
        System.out.println(zahl2);

        zahl2 = 12;

        // Ganzzahlige Datentypen
        short s1;
        int i1 = 1;
        long l1;

        // Fließkomma Zahlen
        float f1;
        double d1 = 1.2;

        // Zeichen
        char c = 'c';
        String s = "Zeichenkette 123123";

        // Boolsche Ausdrücke
        boolean boolscherWert1 = true;
        boolean bf1 = false;

        System.out.println(i1);
        System.out.println(s);
        System.out.println(d1);
        System.out.println(boolscherWert1);

        double d2 = 1.0 * i1 / 2;
        System.out.println(d2);
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 % 8);

        if (boolscherWert1 == false) {
            System.out.println("boolscher Wert war true!");
        } else {
            System.out.println("boolscher Wert war falsch!");
        }

        i1 = 23;

        if (i1 == 1) {
            System.out.println("Jawohl, ist 1");
        } else if (i1 == 2) {
            System.out.println("Jawohl, ist 2");
        } else if (i1 == 3) {
            System.out.println("Jawohl, ist 3");
        } else {
            System.out.println("Ist was anderes");
        }

        switch (i1) {
            case 1:
                System.out.println("Ist eins");
                break;
            case 2:
                System.out.println("Ist zwei");
                break;
            case 3:
                System.out.println("Ist drei");
                break;
            default:
                System.out.println("Ist was anderes");

        }

        // < "echt kleiner"
        // <= "kleiner gleich"
        // > "echt größer"
        // >= "größer gleich"

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        int i2 = 0;
        while (i2 <= 10) {
            System.out.println(i2);
            i2++;
        }

        i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        } while (i2 <= 10);


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + j);
            }
        }


        int[] intArray = new int[5];
        intArray[0] = 111;
        intArray[1] = 112;
        intArray[2] = 113;
        intArray[3] = 114;
        intArray[4] = 115;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        for (int arrayValue: intArray) {
            System.out.println(arrayValue);
        }

        int[][] mehrDimensional = new int[5][5];
        mehrDimensional [0][0] = 0;
        mehrDimensional [0][1] = 1;
        mehrDimensional [0][2] = 2;
        mehrDimensional [0][3] = 3;
        mehrDimensional [0][4] = 4;
        mehrDimensional [1][0] = 10;
        mehrDimensional [1][1] = 11;
        mehrDimensional [1][2] = 12;
        mehrDimensional [1][3] = 13;
        mehrDimensional [1][4] = 14;
        mehrDimensional [2][0] = 20;
        mehrDimensional [2][1] = 21;
        mehrDimensional [2][2] = 22;
        mehrDimensional [2][3] = 23;
        mehrDimensional [2][4] = 24;
        mehrDimensional [3][0] = 30;
        mehrDimensional [3][1] = 31;
        mehrDimensional [3][2] = 32;
        mehrDimensional [3][3] = 33;
        mehrDimensional [3][4] = 34;
        mehrDimensional [4][0] = 40;
        mehrDimensional [4][1] = 41;
        mehrDimensional [4][2] = 42;
        mehrDimensional [4][3] = 43;
        mehrDimensional [4][4] = 44;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(mehrDimensional[i][j]);
            }
        }

        System.out.println("---");

        int ergebnis = meineErsteMethode(8,9);
        System.out.println(ergebnis);

        ichGebeNichtsZurueck(12, 12);
    }


    static int meineErsteMethode(int i, int j) {
        // ganz viel anderer code
        System.out.println("klasjdlka");
        return i + j;
    }

    static void ichGebeNichtsZurueck(int i, int j) {
        System.out.println("Ergebnis der Berechnung:");
        System.out.println(i + j);
    }
}
