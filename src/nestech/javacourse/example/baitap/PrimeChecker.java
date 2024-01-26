package nestech.javacourse.example.baitap;

import java.util.Scanner;

/*
Người dùng nhập một số nguyên từ bàn phím, kiểm tra số đó có phải là số nguyên tố hay không
- Scanner được sử dụng để nhập số nguyên từ bàn phím.
- Kiểm tra xem số đó có phải là số nguyên dương hay không
- Phương thức isPrime được sử dụng để kiểm tra xem một số có phải là số nguyên tố không.
- Kết quả kiểm tra được hiển thị ra màn hình.
* */
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       while (true) {
           System.out.print("Nhập một số nguyên dương: ");
           int number = scanner.nextInt();

           if (isPrime(number)) {
               System.out.println(number + " là số nguyên tố.");
           } else {
               System.out.println(number + " không phải là số nguyên tố.");
           }
       }
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
             return false;
        }
        for (int i=2; i <= n-1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
