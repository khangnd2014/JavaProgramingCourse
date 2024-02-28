package nestech.javacourse.example.oop;

public class StringUtils {
    public static void main(String[] args) {
        String[] arraysNumber = "1, 2, 3, ,4, ,5".split(",");
        int sum = 0;
        for (String number : arraysNumber) {
            // convert to Integer and sum
            // empty vs
            // NULLPOINTEREXPECATION NPE
            try {
                String n = number.trim();
                if (n != null && !n.isEmpty()) {
                    sum += Integer.parseInt(number.trim());
                }

            } catch (Exception ex) {
                System.err.println("Data incorrect format!");
            }
        }
        System.out.println("Tong: " + sum);
    }
}
