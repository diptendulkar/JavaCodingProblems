package easy;

import java.util.*;


/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]
Could you do it without extra space and in O(n) runtime?
You may assume the returned list does not count as extra space.
*/

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums ={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

        int[] nums2 ={1,1};
        System.out.println(findDisappearedNumbers(nums2));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        int n = nums.length;
        for(int i=0; i< n ;i++ ){
            seen.add(nums[i]);
        }

        for(int i=1; i<= n ;i++ ){
            if(!seen.contains(i))
                res.add(i);
        }

        return res;
    }
}
