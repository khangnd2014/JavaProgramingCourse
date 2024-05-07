package nestech.javacourse.example.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectExampleRead {
// read the Stock array from the file

    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("fileobject.dat");
            ois = new ObjectInputStream(fis);
            Stock[] stocks1 = (Stock[]) ois.readObject();
            System.out.println("Doc tu file: ");
            for (Stock s : stocks1) {
                System.out.println(s);
            }
            ois.close();
            fis.close();

        } catch (Exception e) {
            System.out.println("Co loi: " + e);
        }
    }
}
