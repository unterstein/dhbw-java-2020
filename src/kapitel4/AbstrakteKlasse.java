package kapitel4;

public abstract class AbstrakteKlasse {


    public AbstrakteKlasse() {
        System.out.println(hello());
    }


    public abstract String hello();

    public static void main(String[] args) {
        new AbstrakteUnterKlasse();
    }
}
