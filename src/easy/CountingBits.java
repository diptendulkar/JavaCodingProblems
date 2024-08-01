package easy;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int[] res = countBits(5);
        System.out.println(Arrays.toString(res));
    }

    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0; // base case

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i / 2] + (i % 2);
            System.out.println( i + " => " + i/2);
        }

        return dp;
    }
}
