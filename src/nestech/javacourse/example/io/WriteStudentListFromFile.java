package nestech.javacourse.example.io;

import nestech.javacourse.example.condition.Student;

import java.io.*;

public class WriteStudentListFromFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        FileOutputStream fileOutputStream = new FileOutputStream("sinhvien.dat");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        Student[] student = {new Student("Khang", "nguyen", 5),
//                new Student("Khoi", "Nguyen", 10)};
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("sinhvien.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Student[] students = (Student[]) objectInputStream.readObject();
            for (Student student : students) {
                System.out.println(student);
            }
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

    }
}
