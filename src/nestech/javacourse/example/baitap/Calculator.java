package nestech.javacourse.example.baitap;

import java.util.Scanner;
/*
 Tạo một máy tính với menu cho các phép toán cộng, trừ, nhân và chia:
 - Sử dụng một vòng lặp vô hạn để duy trì menu.
 - Người dùng chọn một phép toán từ menu và nhập hai số để thực hiện phép toán.
 - Sử dụng câu lệnh switch để xác định phép toán được chọn và thực hiện tính toán tương ứng.
 - Nếu người dùng chọn 0, chương trình sẽ thoát.
* */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("<----- Calculator Menu ----->");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Enter number to choice (1-5) !");
            int choice = scanner.nextInt();

            if(choice == 1 ) {
                System.out.println("<--- Addition --->");
            }else if(choice == 2) {
                System.out.println("<--- Subtraction --->");
            }else if(choice == 3) {
                System.out.println("<--- Multiplication --->");
            }else if(choice == 4) {
                System.out.println("<--- Division --->");
            }else if(choice == 5) {
                System.out.println("You have exited the calculator.");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("The sum of two numbers: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("The difference of two numbers: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("The product of two numbers: "+ (num1*num2));
                    break;
                case 4:
                    if(num2 != 0) {
                        System.out.println("The quotient of two numbers: " + (num1/num2));
                    } else {
                        System.out.println("Cannot be divided by 0 !!!");
                    }
                    break;
                default:
                    System.out.println("Your selection is invalid!!! Please select again.");
            }
        }
        scanner.close();
    }
}
