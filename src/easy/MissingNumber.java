package easy;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
*/

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums)); // output =1

        int[] nums2 = {0, 1};
        System.out.println(missingNumber(nums2)); //// output =2
    }

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        // Case 1
        if (nums[0] != 0) return 0;
        // Case 2
        if (nums[n - 1] != n) return n;
        for (int i = 1; i < n; i++) {
            if (i != nums[i])
                return i;
        }
        return 0;
    }
}
