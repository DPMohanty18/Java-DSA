package LeetCode;
import java.util.*;

//kth distinct string   

public class LeetCode2053 {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        String ans = kthDistinct(arr, k);
        System.out.println(ans);
    }
    public static String kthDistinct(String[] arr, int k) {
        List<String> distinctList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    flag++;
                }
            }
            if (flag == 1){
                distinctList.add(arr[i]);
            }
        }
        if (k <= distinctList.size()) {
            return distinctList.get(k - 1); // k-1 cause list index is zero-based
        }

        return "";
    }
}
