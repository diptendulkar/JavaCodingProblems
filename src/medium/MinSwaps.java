package medium;

public class MinSwaps {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 1, 0, 0};
        System.out.println(minSwaps(nums));
    }

    public static int minSwaps(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            k += nums[i];
        }
        int sum = 0;
        int min = nums.length;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            if (j >= k) {
                sum -= nums[j - k];
            }
            if (j >= k - 1) min = Math.min(min, k - sum);
        }
        for (int i = 0; i <= k - 2; i++) {

            sum = sum + nums[i] - nums[nums.length - k + i];
            min = Math.min(min, k - sum);
        }
        return min;
    }
}
