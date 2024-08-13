import java.util.*;

class QuickSort{
    public static void main(String[] args) {
        int[] arr = {2, 4, 8 ,5 ,9};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int hi){
        if (low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s) /2;
        int pivot = nums[m];

        while (s <= e){
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e] > pivot){
                e--;
            }
            if (s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++; e--;
            }
        }
        //now the pivot is at correct position
        quickSort(nums, low, e);
        quickSort(nums, s, hi);
    }
}