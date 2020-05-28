package kapitel4.sichtbarkeiten;

/**
 * @author Kai S. K. Engelbart
 * @since 0.0.1
 */
public class Visibility1 {

    int i;
    static int i2 = 1;

    {
        i += i2++;
        System.out.println(++i);
    }

    class Loc {

        int i = 7;
        {
            Visibility1.this.i = ++i2;
            System.out.println(i2);
        }
    }

    public Visibility1() {
        System.out.println(inc(i));
    }

    int inc(Integer i) {
        i += ++this.i;
        System.out.println(i);
        return this.i;
    }
}