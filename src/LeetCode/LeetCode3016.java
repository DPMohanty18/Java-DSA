package LeetCode;

import java.util.Arrays;

public class LeetCode3016 {
    public static void main(String[] args) {
        String word = "example";
        System.out.println(minimumPushes(word));
    }
    public static int minimumPushes(String word) {
        int[] count = new int[26];

        for (char c : word.toCharArray())
            count[c - 'a']++;

        Arrays.sort(count);

        int ans = 0;
        for (int i = 0; i < 26; i++)
            ans += count[25 - i] * (i / 8 + 1);

        return ans;
    }
}
