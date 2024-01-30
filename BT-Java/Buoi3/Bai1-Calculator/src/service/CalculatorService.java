package service;

public class CalculatorService {
    private double a;
    private double b;
    public CalculatorService(){

    }
    public CalculatorService(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }
    public double getB(){
        return b;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public static double cong(double a, double b){
        return a + b;
    }
    public static double tru(double a, double b){
        return a - b;
    }
    public static double nhan(double a, double b){
        return a * b;
    }
    public static double chia(double a, double b){
        if(b == 0){
            System.out.println("Loi: Phep toan khong chia duoc cho 0!!!");
        }
        return a/b;
    }
}
