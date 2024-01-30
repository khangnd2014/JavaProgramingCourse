public class Main {
    public static void calculateCommonElementsSum(int[] array1, int[] array2){
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    int ketqua = array1[i] + array2[j];
                    System.out.println("Tong 2 so " + array1[i] + " la: " + ketqua);;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        calculateCommonElementsSum(array1, array2);
    }
}