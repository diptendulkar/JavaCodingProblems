package medium;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> listSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int x = -(nums[i] + nums[j]);
                // System.out.println(x);
                if (set.contains(x)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(x);
                    Collections.sort(list);
                    listSet.add(list);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        Iterator<List<Integer>> iterator = listSet.iterator();
        while (iterator.hasNext()) {
            List<Integer> list = iterator.next();
            ans.add(list);
        }
        return ans;
    }
}
