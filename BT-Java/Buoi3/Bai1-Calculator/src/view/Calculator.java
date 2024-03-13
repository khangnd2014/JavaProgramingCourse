package view;

import service.CalculatorService;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        double so1, so2, ketqua;
        while(check){
            System.out.println("1. Phep cong");
            System.out.println("2. Phep tru");
            System.out.println("3. Phep nhan");
            System.out.println("4. Phep chia");
            System.out.println("0. Thoat!");
            System.out.println("Chon so: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap a: ");
                    so1 = scanner.nextDouble();
                    System.out.println("Nhap b: ");
                    so2 = scanner.nextDouble();
                    ketqua = CalculatorService.cong(so1, so2);
                    System.out.println("Ket qua: " + ketqua);
                    break;
                case 2:
                    System.out.println("Nhap a: ");
                    so1 = scanner.nextDouble();
                    System.out.println("Nhap b: ");
                    so2 = scanner.nextDouble();
                    ketqua = CalculatorService.tru(so1, so2);
                    System.out.println("Ket qua: " + ketqua);
                    break;
                case 3:
                    System.out.println("Nhap a: ");
                    so1 = scanner.nextDouble();
                    System.out.println("Nhap b: ");
                    so2 = scanner.nextDouble();
                    ketqua = CalculatorService.nhan(so1, so2);
                    System.out.println("Ket qua: " + ketqua);
                    break;
                case 4:
                    System.out.println("Nhap a: ");
                    so1 = scanner.nextDouble();
                    System.out.println("Nhap b: ");
                    so2 = scanner.nextDouble();
                    ketqua = CalculatorService.chia(so1, so2);
                    System.out.println("Ket qua: " + ketqua);
                    break;
                case 0:
                    check = false;
            }
        }
    }
}
