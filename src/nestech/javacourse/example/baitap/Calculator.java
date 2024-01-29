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
        boolean isRunning = true;

        while(isRunning){
            System.out.println("1. Summation (+) ");
            System.out.println("2. Subtraction (-) ");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/) ");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();

            if(choice != 0){
                System.out.println("Enter first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double secondNumber = scanner.nextDouble();

                switch (choice){
                    case 1:
                        System.out.println(firstNumber + secondNumber);
                        break;
                    case 2:
                        System.out.println(firstNumber - secondNumber);
                        break;
                    case 3:
                        System.out.println(firstNumber * secondNumber);
                        break;
                    case 4:
                        System.out.println(firstNumber / secondNumber);
                        break;
                    default:
                        System.out.println("The choice is invalid please enter again");
                }

            }
            else {
                System.out.println("Closing application...");
                isRunning = false;
            }
        }
    }
}
