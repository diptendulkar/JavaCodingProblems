package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*

* */
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3}; // o/p [1,1,2,2,3]  can contain max 2 duplicates
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;

    }
}
