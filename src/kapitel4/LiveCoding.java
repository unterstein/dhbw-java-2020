package kapitel4;

import kapitel3.model.Pkw;
import kapitel3.model.VolvoV70;
import kapitel4.uebung.Quadrat;

public class LiveCoding {

    final transient VolvoV70 v70;
    private int x;

    public LiveCoding() {
        v70 = new VolvoV70();
        InnerClass innerClass = new InnerClass();
        innerClass.x = 5;
        innerClass.y = 5;
    }

    class InnerClass {
        private int y;
        private int x;

        public InnerClass() {
            v70.anzahlBlinker = 565;
            x = 60;
            LiveCoding.this.x = 65;
        }
    }

    static class InnerClassStatic {
        int i;
        public InnerClassStatic() {
        }
    }

    public static void main(final String[] args) {
        VolvoV70 v70 = new VolvoV70();

        System.gc();

        System.out.println("Hi from main!");
        Quadrat q = new Quadrat(15);

        System.out.println(q);

        // final!
        final int meinInt = 5;
        final Quadrat q2 = new Quadrat(42);
        q = new Quadrat(12);
        System.out.println(q);
        System.out.println(q2);

        q2.setLaenge(43);
        System.out.println(q2);

        AbstrakteKlasse a = new AbstrakteKlasse() {

            @Override
            public String hello() {
                return "hello!";
            }
        };
        System.out.println(a.hello());

        DefaultInterface defaultInterface = new DefaultInterface() {

            @Override
            public int methode1(int i) {
                return 0;
            }
        };


        Pkw pkw = new Pkw() {
            @Override
            public boolean stapelbar() {
                return true;
            }
        };


        int i = 50;
        Integer i2 = new Integer(i);
        Integer i3 = i; // new Integer(i);
        int i4 = i3; // i3.intValue();
        Integer i5 = null;

        test(i4); // test(i4.intValue());
        test(i3); // test(i3.intValue());
        test(i5); // test(i5.intValue());
    }

    private static void test(int i) {
        System.out.println(i);
    }

}
