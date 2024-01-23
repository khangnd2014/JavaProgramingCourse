package nestech.javacourse.example.condition;

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

        while (true) {
            System.out.println("------ Calculator Menu ------");
            System.out.println("1. Tính tổng");
            System.out.println("2. Tính hiệu");
            System.out.println("3. Tính tích");
            System.out.println("4. Tính thương");
            System.out.println("0. Thoát");

            System.out.print("Chọn một phép toán (0-4): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Đã thoát chương trình.");
                break;
            }

            System.out.print("Nhập số thứ nhất: ");
            double num1 = scanner.nextDouble();
            System.out.print("Nhập số thứ hai: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Tổng: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Hiệu: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Tích: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Thương: " + (num1 / num2));
                    } else {
                        System.out.println("Không thể chia cho 0.");
                    }
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }

        scanner.close();
    }
}
