package medium;

import java.util.Arrays;

/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2*/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {4,3,4,1,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        //With SORTING THE ARRAY
      /*  Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1])
                return nums[i];
        }
        return 0;*/

        //WITHOUT SORTING THE ARRAY -> TORTOISE METHOD OR Floyd's Cycle Detection

        int slow = nums[0], fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;

    }
}
