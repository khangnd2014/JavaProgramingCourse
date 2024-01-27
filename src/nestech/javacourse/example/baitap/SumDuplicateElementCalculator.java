package nestech.javacourse.example.baitap;

/*
Cho 2 mảng số nguyên, tìm các số xuất hiện trong cả 2 mảng này, sau đó tính tổng các số này ra màn hình.
(Có thể sử dụng 2 vòng lặp để làm)
* */
public class SumDuplicateElementCalculator {

    public static void main(String[] args) {
        // Test the calculateCommonElementsSum method
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int sum = calculateCommonElementsSum(array1, array2);
        System.out.println("Tổng các số xuất hiện trong cả hai mảng: " + sum);
    }

    public static int calculateCommonElementsSum(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    sum += num1; // hoặc sum = sum + num1 hoặc sum = sum + num2
                    break;
                }
            }
        }
        return sum;
    }

}

