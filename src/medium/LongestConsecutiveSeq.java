package medium;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
*/
public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}; //{100,4,200,1,3,2};
        longestConsecutive2(nums);

    }

    // this is O(n)
    public static int longestConsecutive(int[] nums) {

        if (nums.length == 1 || nums.length == 0) {
            return nums.length;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums)
            set.add(num);

        // set.stream().forEach(System.out::println);
        if (set.size() < 2)
            return set.size();

        TreeSet<Integer> length = new TreeSet<>();

        Iterator<Integer> iterator = set.iterator();
        int len = 0;
        int n = iterator.next();
        int n2 = iterator.next();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(n + "=>" + n2);
            if (n == n2 - 1) {
                len++;
                n = n2;
                if (iterator.hasNext())
                    n2 = iterator.next();
            } else {
                length.add(++len);
                len = 0;
                n = n2;
                if (iterator.hasNext())
                    n2 = iterator.next();
            }


        }
        length.stream().forEach(System.out::println);
        System.out.println(length.getLast());

        return length.getLast();
    }

    public static int longestConsecutive2(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return nums.length;
        }

        Arrays.sort(nums);
        int len=1 , maxLen=0;
        for (int i=1; i<nums.length ; i++){

            if(nums[i] == nums[i-1])
                continue;
            if(nums[i]-1 == nums[i-1]) {
                len++;
                maxLen = Math.max(maxLen,len);

            }
            else {
                len=1;
            }
        }
        maxLen = Math.max(maxLen, len); // for [0,0] case
        System.out.println(maxLen);
        return  maxLen;
    }
}
