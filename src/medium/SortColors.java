package medium;


import java.util.Arrays;

/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
https://leetcode.com/problems/sort-colors/description
*/
public class SortColors {
    public static void main(String[] args) {
    int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums));
    sortColors(nums);
    }

//    The provided code implements a sorting algorithm called the "Dutch National Flag" algorithm
//    to sort an array containing elements with values 0, 1, and 2.
//    Here's a breakdown of the code and some improvements:
    public static void sortColors(int[] nums) {

        int left=0, right = nums.length -1, i=0;

        while(i <= right){
            if(nums[i] == 2){
                nums[i] = nums[right];
                nums[right] = 2;
                right--;
            }
            else {
                if( nums[i] == 0){
                    nums[i] = nums[left];
                    nums[left] = 0;
                    left++;
                }
                i++;
            }

            System.out.println(Arrays.toString(nums));

        }
        System.out.println(Arrays.toString(nums));

    }
}
