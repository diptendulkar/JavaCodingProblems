package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubarrayProduct {
    public static void main(String[] args) {
         int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(" Num 1=" +numSubarrayProductLessThanK(nums, k)); //8

        int[] nums2 = {1, 1, 1};
        int k2 = 2;
        System.out.println(" Num 2=" +numSubarrayProductLessThanK(nums2, k2)); //6

        int[] nums3 = {1, 1, 1};
        int k3 = 1;
        System.out.println(" Num 3=" +numSubarrayProductLessThanK(nums3, k3)); //0

        int[] nums4 = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        int k4 = 19;
        System.out.println(" Num 4=" +numSubarrayProductLessThanK(nums4, k4)); //18
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0, product = 1, count = 0;
        int n = nums.length;
        if(k <= 1) return 0;
        while (right < n) {
            product *= nums[right];
            while (product >= k) product /= nums[left++];
            count += 1 + (right - left);
            right++;
        }
        return count;
    }
}
