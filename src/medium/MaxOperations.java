package medium;

import java.util.Arrays;

public class MaxOperations {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(maxOperations(nums, 5));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int first = 0;
        int last = nums.length - 1;
        int result = 0;

        while (first < last) {
            if (nums[first] + nums[last] > k) {
                last--;
            } else if (nums[first] + nums[last] < k) {
                first++;
            } else {
                first++;
                last--;
                result++;
            }
        }

        return result;
    }
}
