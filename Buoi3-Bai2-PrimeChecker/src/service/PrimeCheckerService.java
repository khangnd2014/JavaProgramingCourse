package service;
public class PrimeCheckerService {
    private int a;
    public PrimeCheckerService(){}
    public PrimeCheckerService(int a){
        this.a = a;
    }
    public static boolean isPrime(int a){
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a%i == 0){
                return false;
            }
        }
        return a>1;
    }
}
