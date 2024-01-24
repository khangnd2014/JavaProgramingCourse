package nestech.javacourse.example.condition;

import java.util.Scanner;

/*
Người dùng nhập số kWh điện tiêu thụ từ bàn phím.
Phương thức tinhGiaDien tính giá điện dựa trên cấu trúc giá cơ bản.
    Khoảng 1: 0 - 50 kWh
    Giá: 1,500 VND/kWh
    Khoảng 2: 51 - 100 kWh
    Giá: 2,000 VND/kWh
    Khoảng 3: 101 - 200 kWh
    Giá: 2,500 VND/kWh
    Khoảng 4: Trên 200 kWh
    Giá: 3,000 VND/kWh
Kết quả giá điện được xuất ra màn hình.
* */
public class TinhGiaDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số kWh điện tiêu thụ: ");
        double soKWh = scanner.nextDouble();
        double giaDien = tinhGiaDien(soKWh);
        System.out.println("Giá điện là: " + giaDien + " VND");
        scanner.close();
    }

    // Phương thức tính giá điện
    public static double tinhGiaDien(double soKWh) {
        double giaDien = 0;
        // Implement your code here
        return giaDien;
    }
}
