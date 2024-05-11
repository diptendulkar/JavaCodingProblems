package medium;


/*Given an array of positive integers nums and a positive integer target, return the minimal length of a
        subarray
whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.*/


public class MinSubArrayLen {
    public static void main(String[] args) {

       int  target = 7;
       int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));



    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(j<nums.length) {
            sum += nums[j];
            if(sum < target){
                j++;
            }
            else {
                while(sum >= target) {
                    min = Math.min(min,(j-i+1));
                    sum -= nums[i];
                    i++;
                }
                j++;
            }
        }
        if(i==0) {
            return 0;
        }
        return min;
    }
}
