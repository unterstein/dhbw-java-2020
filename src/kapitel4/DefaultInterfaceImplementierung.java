package kapitel4;

public class DefaultInterfaceImplementierung implements DefaultInterface, DefaultInterface2 {
    @Override
    public int methode1(int i) {
        return 2 * i;
    }

    @Override
    public int methode2(int i1, int i2) {
        return 0;
    }

    public static void main(String[] args) {
        DefaultInterfaceImplementierung a = new DefaultInterfaceImplementierung();
        System.out.println(a.methode1(1));
        System.out.println(a.methode2(1, 2));

        DefaultInterface d = a;
        DefaultInterface2 d2 = a;
        System.out.println(d.methode1(1));
        System.out.println(d2.methode1(2));

    }
}
