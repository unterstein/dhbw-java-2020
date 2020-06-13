package kapitel6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        System.out.println(readFileToString(new File("/Users/junterstein/Desktop/test2/file")));
    }

    private static String readFileToString(File f) {
        String result = "";
        try (BufferedReader bf =
                     new BufferedReader(
                             new FileReader(f))) {
            String line = null;
            while ((line = bf.readLine()) != null) {
                result += line + System.lineSeparator(); // System.getProperty("line.separator");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
