package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        //find all duplicates
        int[] nums2 ={4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(nums2));
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

    public static List<Integer> findAllDuplicates(int[] nums) {
        //nt[] nums2 ={4,-3,2,-7,8,2,3,1};
        List<Integer> result = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if (nums[x - 1] < 0) {
                result.add(x);
            }
            nums[x - 1] *= -1;
        }

        return result;

    }
}
