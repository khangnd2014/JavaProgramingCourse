package nestech.javacourse.example.introduction;

import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        // add comment
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        // System.out.printf("%s, %d age", name, ages);
        System.out.println("Name: " + name + " , " + age + " age");
    }
}
