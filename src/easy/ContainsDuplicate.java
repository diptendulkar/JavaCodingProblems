package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(findDuplicate(nums));

        Set<Integer> list = new HashSet<>();
        System.out.println(Arrays.stream(nums).anyMatch(num -> !list.add(num)));

    }

    public static boolean findDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();

        for (int num : nums) {
            if (list.contains(num)) {
                return true;
            }
            list.add(num);

        }
        return false;
    }
}
