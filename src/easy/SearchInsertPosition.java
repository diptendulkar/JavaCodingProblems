package easy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
* */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int mid = 0;
        int high = n - 1;
        int low = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            if (target < nums[mid]) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }


        return low;
    }
}
