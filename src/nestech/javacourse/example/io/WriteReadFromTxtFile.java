package nestech.javacourse.example.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadFromTxtFile {
    public static void main(String[] args) throws IOException {
        File fileName = new File("student.txt");
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write("Doc ghi du lieu trong Java");
        fileWriter.write("\n");
        fileWriter.write("Su dung stream");
        fileWriter.close();

        FileReader fileReader = new FileReader(fileName);
        System.out.print("Doc tu file:");
        int ch = fileReader.read();
        while (ch != -1) {
            System.out.println((char) ch);
            ch = fileReader.read();
        }

    }
}
