package kapitel3.model;

public class Pkw implements SpezielleGroesse, Stapelbar {
    public int anzahlBlinker;

    public void blinkeRechts() {
        System.out.println("blinke rechts!");
    }

    @Override
    public int getLaenge() {
        return 402;
    }

    @Override
    public boolean stapelbar() {
        return false;
    }

    @Override
    public int spezielleLaenge() {
        return 502;
    }

    public static void main(String[] args) {
        Pkw pkw = new Pkw();
        Stapelbar s = pkw;
        Groesse g = pkw;
        SpezielleGroesse sg = pkw;
        VolvoV70 v70 = new VolvoV70();
        Stapelbar s2 = v70;
    }
}
