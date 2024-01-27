package nestech.javacourse.example.baitap;

/*Cho một mảng các số nguyên, tìm số lớn thứ hai trong mảng
- Phương thức findSecondLargest được sử dụng để tìm số lớn thứ hai trong mảng.
- Nếu mảng có ít hơn 2 phần tử, chương trình trả về Integer.MIN_VALUE để chỉ ra rằng không có số lớn thứ hai.
- Kết quả được hiển thị ra màn hình.
* */
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};
        int secondLargest = findSecondLargest(numbers);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Số lớn thứ hai trong mảng là: " + secondLargest);
        } else {
            System.out.println("Không có số lớn thứ hai trong mảng.");
        }
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
