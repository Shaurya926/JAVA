package lect_25;

import java.util.Arrays;

public class C1 {
    static int decode(String s, int i, int[] dp) {
        if (i == s.length()) return 1; // base case: reached end
        if (s.charAt(i) == '0') return 0; // invalid if starts with 0
        if (dp[i] != -1) return dp[i]; // memoization check

        // Option 1: take one digit
        int one = decode(s, i + 1, dp);

        // Option 2: take two digits if valid
        int two = 0;
        if (i + 1 < s.length()) {
            int num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
            if (num <= 26) {
                two = decode(s, i + 2, dp);
            }
        }

        dp[i] = one + two;
        return dp[i];
    }

    public static void main(String[] args) {
        String s = "12";
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        System.out.println(decode(s, 0, dp)); // Output should be 2
    }
}
