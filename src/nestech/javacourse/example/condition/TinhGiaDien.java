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
        if (soKWh <= 50) {
            giaDien = soKWh * 1500;
        } else if (soKWh <= 100) {
            giaDien = 50 * 1500 + (soKWh - 50) * 2000;
        } else if (soKWh <= 200) {
            giaDien = 50 * 1500 + 50 * 2000 + (soKWh - 100) * 2500;
        } else {
            giaDien = 50 * 1500 + 50 * 2000 + 100 * 2500 + (soKWh - 200) * 3000;
        }
        return giaDien;
    }
}
