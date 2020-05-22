package kapitel4;

public class KonstruktorBeispiel1 {

    String string1;
    String string2;

    public KonstruktorBeispiel1(String string1) {
        this.string1 = string1;
        // mehr Methoden!
    }

    public KonstruktorBeispiel1(String string1, String string2) {
        this(string1);
        this.string2 = string2;
    }

    public static void main(String[] args) {


        KonstruktorBeispiel1 k1 = new KonstruktorBeispiel1("Hallo!");
        KonstruktorBeispiel1 k2 = new KonstruktorBeispiel1("Hallo!", "Welt!");
    }
}
