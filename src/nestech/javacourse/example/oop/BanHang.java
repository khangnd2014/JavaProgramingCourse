package nestech.javacourse.example.oop;

public class BanHang {
    public static void main(String[] args) {
       // Step 1 Mua hang
        // Diem thong tin khach hang
        // Check xem da mua thanh cong chua
        payment(1);


    }

    static void payment(Integer input) {
        Payment payment;
        if (input == 1) {
            payment = new PaytmentByCash();
            payment.transfer();
        } else {
            payment = new PaymentByMomo();
            payment.transfer();
        }
    }
}
