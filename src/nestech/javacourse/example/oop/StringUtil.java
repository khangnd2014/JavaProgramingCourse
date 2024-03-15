package nestech.javacourse.example.oop;

public class StringUtil {
    public static void main(String[] args) {
        String[] arr = "1, 3, 4, 6, 7, 8".split(",");
        int sum = 0;
        for(String num : arr){
            try {
                String n = num.trim();
                if(n!=null )
                sum += Integer.parseInt(num.trim());
            }catch (Exception e){
                System.out.println( "invalid number");
            }
        }
        System.out.println(sum);
    }
}
