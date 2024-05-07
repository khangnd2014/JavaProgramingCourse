package nestech.javacourse.example.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectExampleWrite {
    public static void main(String[] args) throws
            IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("fileobject.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Stock[] stocks = {new Stock(1001, "CD ROM", 100.00, 20),
                new Stock(1002, "DRAM", 75.00, 30),
                new Stock(1003, "P4 Processor", 300.00, 100),
                new Stock(1004, "Canon Jet", 80.00, 10),
                new Stock(1005, "HP Scanner", 75.00, 90)};
        //Ghi mang doi tuong vao file 'fileobject.dat'
        oos.writeObject(stocks);
        oos.close();
    }
}
