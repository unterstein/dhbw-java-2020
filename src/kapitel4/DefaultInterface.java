package kapitel4;

public interface DefaultInterface {
    int methode1(int i);

    default int methode2(int i1, int i2) {
        return methode1(i1 + i2);
    }
}
