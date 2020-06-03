package kapitel5;

import kapitel3.model.AudiQ5;

public class AlteListeVerwendung {

    public AlteListeVerwendung() {
        // Hmm...eigentlich will ich nur Integer zulassen, geht aber nicht :-(
        AlteListe<Integer> liste = new AlteListe<Integer>(10);
        AlteListe<AudiQ5> q5Liste = new AlteListe<AudiQ5>(10);
        liste.addElement(5);

        // Der Rückgabetyp ist Object
        Integer objectFromListe = liste.elementAt(0);


        AlteListe<Number> numberList = new AlteListe<Number>(20);

        Integer i = 12;
        Number n = i;

        printList(numberList);
        printList(liste);

        printNumberList(numberList);
//        printNumberList(q5Liste); geht nicht!
    }

    public void printList(AlteListe<?> liste) {
        for (int i = 0; i < liste.getSize(); i++) {
            Object o = liste.elementAt(i);
            System.out.println(o);
        }
    }

    void printNumberList(AlteListe<? extends Number> numberList) {
        for (int i = 0; i < numberList.getSize(); i++) {
            Object o = numberList.elementAt(i);
            System.out.println(o);
        }
    }
}











