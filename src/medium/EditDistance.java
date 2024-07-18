package medium;

public class EditDistance {
    public static void main(String[] args) {
        EditDistance solution = new EditDistance();
        String word1 = "horse";
        String word2 = "ros";
        System.out.println("Minimum operations to convert " + word1 + " to " + word2 + ": " + solution.minDistance(word1, word2));
    }
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // Create a DP array to memoize results of previous computations
        int[][] dp = new int[m + 1][n + 1];

        // Fill dp array
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If first string is empty, only option is to
                // insert all characters of second string
                if (i == 0) {
                    dp[i][j] = j; // Min. operations = j
                }
                // If second string is empty, only option is to
                // remove all characters of first string
                else if (j == 0) {
                    dp[i][j] = i; // Min. operations = i
                }
                // If last characters are the same, ignore the last character
                // and recur for the remaining substring
                else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If last characters are different, consider all possibilities
                // and find the minimum
                else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], // Replace
                            Math.min(dp[i - 1][j], // Remove
                                    dp[i][j - 1])); // Insert
                }
            }
        }

        return dp[m][n];
    }

}
