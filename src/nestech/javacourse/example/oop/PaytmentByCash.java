package nestech.javacourse.example.oop;

public class PaytmentByCash extends Payment{
    @Override
    void transfer() {
        System.out.println("Paymnent By cash");
    }
}
