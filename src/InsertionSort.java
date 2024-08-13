import java.util.Arrays;

class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 14, 25};
        sort(arr);
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1 ; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}