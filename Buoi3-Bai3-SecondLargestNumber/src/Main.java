import java.util.Scanner;

public class Main {
    public static int findSecondLargest(int[] numbers){
        int firstLargest = numbers[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > firstLargest){
                firstLargest = numbers[i];
            }
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > secondLargest && numbers[i] < firstLargest){
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        if(n<2){
            System.out.println("Loi so luong phan tu: " + Integer.MIN_VALUE);
        }else{
            System.out.println("Nhap phan tu trong mang: ");
            int[] numbers = new int[n];
            for(int i = 0; i < numbers.length; i++){
                numbers[i] = scanner.nextInt();
            }
            System.out.println("So lon thu hai la: " + findSecondLargest(numbers));
        }
    }
}