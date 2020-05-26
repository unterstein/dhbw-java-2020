package kapitel3;

public class HelloWorld {
    static char c;
    static String s;

    public static void main(String[] args) {
        System.out.println("->" + c + "<-");
        System.out.println(s);

        int i = Short.MAX_VALUE+1;
        System.out.println(i);
        System.out.println((short)i);
    }
}