package LeetCode;

import java.util.Arrays;

class MissingNumber {
//    public static void main(String[] args) {
//        int[] arr = {4, 0, 2, 1};
//        int missingNumber = findMissingNumber(arr);
//        System.out.println("Missing Number is: " + missingNumber);
//    }
//
//    static int findMissingNumber(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            while (arr[i]!= i && arr[i] < n) {
//                int temp = arr[arr[i]];
//                arr[arr[i]] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < n; i++) {
//            if (arr[i]!= i) {
//                return i;
//            }
//        }
//        return n;
//    }
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        int num = missingNumber(arr);
        System.out.println("Missing Number is: "+num);
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

        static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
