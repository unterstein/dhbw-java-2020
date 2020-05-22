package kapitel3.model;

public class SUV extends Pkw {


    int anzahlBlinker = 12;

    public void fahreVorwärts() {
        int anzahlBlinker = 5;
        this.anzahlBlinker = 12;
        super.anzahlBlinker = 2;


        blinkeRechts(); // this.blinkeRechts()
        this.blinkeRechts();
        super.blinkeRechts();
    }

    @Override
    public void blinkeRechts() {
        System.out.println("bereite Differenzial vor!");
        super.blinkeRechts();
        System.out.println("mache was anderes");
    }


    public static void main(String[] args) {
        Pkw[] pkws = new Pkw[4];
        pkws[0] = new VolvoV70();
        pkws[1] = new SUV();
        pkws[2] = new AudiQ5();
        pkws[3] = new AudiQ7();

        for (Pkw p : pkws) {
            p.blinkeRechts();
        }
    }
}
