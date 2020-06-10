package vorlesung;

public class LiveCoding {

    public static void main(String[] args) {
        InnereKlasse.meineStatischeVariable = 12;

        InnereKlasse inner = new InnereKlasse();
        inner.meineLokaleVariable = 15;
        System.out.println(inner.meineLokaleVariable);
        System.out.println(inner.meineStatischeVariable);

        InnereKlasse inner2 = new InnereKlasse();
        InnereKlasse.meineStatischeVariable = 15;
        inner2.meineStatischeVariable = 16;


        System.out.println(inner.meineStatischeVariable);
        for (int i = 0; i < 100; i++) {
            InnereKlasse.counter++;
        }
    }


    static class InnereKlasse {
        static int meineStatischeVariable;
        int meineLokaleVariable;

        static final int ANZAHL_REIFEN = 4;
        static int counter;
    }

}
