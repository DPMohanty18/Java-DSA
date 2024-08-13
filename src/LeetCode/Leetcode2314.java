package LeetCode;

public class Leetcode2314 {
    public static void main(String[] args) {
        Leetcode2314 solution = new Leetcode2314();
        int[] nums1 = {0, 1, 0, 1, 1, 0, 0};
        System.out.println(solution.minSwaps(nums1));
    }

    public int minSwaps(int[] nums) {
        int count = 0;

        // Count the number of 1's in the array
        for (int vl : nums) {
            if (vl == 1) {
                count++;
            }
        }

        // Early return if there are no 1's or all elements are 1's
        if (count == 0 || count == nums.length) {
            return 0;
        }

        // Find the minimum number of swaps needed in a sliding window
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int czeros = 0;

        // Create an extended array to simulate the circular behavior
        for (int i = 0; i < count; i++) {
            if (nums[i] == 0) {
                czeros++;
            }
        }

        ans = czeros;

        for (int i = count; i < n + count; i++) {
            if (nums[i % n] == 0) {
                czeros++;
            }
            if (nums[(i - count) % n] == 0) {
                czeros--;
            }
            ans = Math.min(ans, czeros);
        }

        return ans;
    }
}

