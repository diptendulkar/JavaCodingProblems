package hard;

public class CandyDistribution {

    public static int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 0) {
            return 0;
        }

        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Traverse from left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        System.out.println(candy(ratings));  // Output: 5
    }
}
