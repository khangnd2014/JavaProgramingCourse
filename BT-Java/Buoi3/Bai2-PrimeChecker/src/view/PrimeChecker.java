package view;

import java.util.Scanner;
import service.PrimeCheckerService;
public class PrimeChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen duong: ");
        int a = scanner.nextInt();
        if( a < 0 ){
            System.out.println(a + " la so am");
        } else if (PrimeCheckerService.isPrime(a)) {
            System.out.println(a + " la so nguyen to");
        } else{
            System.out.println(a + " khong phai la so nguyen to");
        }
    }
}
