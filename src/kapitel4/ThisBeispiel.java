package kapitel4;

public class ThisBeispiel {

    private String string;

    public String getVariable() {
        String string = "hi!";
        {
            // String string = "jo!"; Geht nicht!
            String string2 = "huhu!";
        }
        // System.out.println(string2); Geht nicht!
        return this.string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        ThisBeispiel t = new ThisBeispiel();
        t.string = "Hallo!";

        System.out.println(t.getVariable());


        LiveCoding.InnerClassStatic innerClassStatic = new LiveCoding.InnerClassStatic();
    }
}
