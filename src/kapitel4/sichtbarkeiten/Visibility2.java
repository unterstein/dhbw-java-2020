package kapitel4.sichtbarkeiten;

/**
 * @author Kai S. K. Engelbart
 * @since 0.0.1
 */
public class Visibility2 extends Visibility1 {

    int i = ++super.i - 5;

    public Visibility2(int i) {
        this.i = i++;
        System.out.println(inc(this.i + ++i));
    }

    @Override
    int inc(Integer i) {
        System.out.println(super.inc(i));
        return ++i;
    }

    int inc(int i) {
        System.out.println(i);
        return super.i + 1;
    }

    public static void main(String[] args) {
        Visibility1.Loc b = new Visibility1().new Loc();
        b.i = 9;
        new Visibility2(b.i);
    }
}