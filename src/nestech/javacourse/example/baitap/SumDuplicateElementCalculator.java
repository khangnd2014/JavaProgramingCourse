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

        // Duyệt qua từng phần tử của mảng thứ nhất
        for (int i = 0; i < arr1.length; i++) {
            // Duyệt qua từng phần tử của mảng thứ hai để so sánh
            for (int j = 0; j < arr2.length; j++) {
                // Nếu có số xuất hiện trong cả hai mảng
                if (arr1[i] == arr2[j]) {
                    sum += arr1[i];
                    break; // Đảm bảo chỉ cộng một lần nếu số xuất hiện nhiều lần
                }
            }
        }

        return sum;
    }

}

