package hard;

import java.util.HashSet;
import java.util.Set;

/*Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
 Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.*/
public class firstMissingPositive {
    public static void main(String[] args) {

       int[] nums = {3,4,2,1};
        System.out.println(firstMissingPositive2(nums));
    }

    public static int firstMissingPositive(int[] nums) {


        Set<Integer> seen = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            seen.add(nums[i]);
        }
        for(int i=0; i< nums.length; i++){
           if(!seen.contains(i+1))
               return i+1;
        }
        return nums.length +1;
    }

    public static int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n+1];


        for(int num : nums){
            if(num > 0 && num<= n){
                seen[num] = true;
            }
        }

        for(int i = 1; i<= n; i++){
            if(!seen[i]){
                return i;
            }
        }
        return n+1;
    }

    }
