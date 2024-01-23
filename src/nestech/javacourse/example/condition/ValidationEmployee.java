package nestech.javacourse.example.condition;

import java.util.Scanner;

public class ValidationEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You eligible to register insurance!");
        } else {
            System.err.println("Sr, but you still enough age to register this insurance.");
        }
    }
}
