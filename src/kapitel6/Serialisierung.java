package kapitel6;

import kapitel3.model.VolvoV70;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialisierung {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File out = new File("/Users/junterstein/Desktop/test2/v70");
//        VolvoV70 v70 = new VolvoV70();
//        v70.anzahlBlinker = 312312;
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(out));
//        objectOutputStream.writeObject(v70);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(out));
        Object o = objectInputStream.readObject();
        if (o instanceof VolvoV70) {
            VolvoV70 v70 = (VolvoV70) o;
            System.out.println(v70.anzahlBlinker);
        }
    }
}
