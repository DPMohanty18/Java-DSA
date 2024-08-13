import java.util.*;

class linearsearch{
    public static void main(String[] args) {
        int[] a = {2,23,4,43,55,34};
        int target = 243;
        int ans = lisearch(a,target);
        if(ans == -1){
            System.out.println("Target Item not found in the array");
        }
        else {
            System.out.println("The target was found at "+ans+"index of the array");
        }
    }


        //search in the array(going return the index if item found)
        //if not found return -1
        static int lisearch(int[] arr, int target){
            if(arr.length==0)
                return -1;
            for (int index = 0; index < arr.length; index++) {
                //search the element equal to the target
                int element = arr[index];
                if(element == target){
                    return index;
                }
                
            }
            return -1;
        }
}