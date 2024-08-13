package LeetCode;

import java.util.Arrays;

public class LeetCode1508 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int left = 1;
        int right = 5;
        System.out.println(rangeSum(nums, n, left, right));
    }

    public static int rangeSum(int[] nums, int n, int left, int right) {
        int result = 0;
        int index = 0;
        int[] asum = new int[n * (n + 1) / 2];

        // Calculate sum of each subarray and store in asum
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                asum[index++] = sum;
            }
        }

        Arrays.sort(asum);

        // Calculate the sum from left to right index in the sorted array
        for (int i = left - 1; i < right; i++) {
            result += asum[i];
        }

        return result;
    }
}
