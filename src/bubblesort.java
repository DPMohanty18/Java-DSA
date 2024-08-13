import java.util.Arrays;

class bubbleSort{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sort(arr);
    }
    static void sort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for j loop it will run till length-i th index
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if it did not swap for a particular value of i
            // then the array is already sorted, so there is no need for further swapping
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}