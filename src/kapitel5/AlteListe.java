package kapitel5;

public class AlteListe<T> {
    private Object[] data;
    private int size;

    public AlteListe(int maxSize) {
        this.data = new Object[maxSize];
        this.size = 0;
    }

    public void addElement(T element) {
        if (size >= data.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        data[size++] = element;
    }

    public T elementAt(int index) {
        if (size >= data.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    public int getSize() {
        return size;
    }
}

