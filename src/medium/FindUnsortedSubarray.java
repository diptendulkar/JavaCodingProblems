package medium;

public class FindUnsortedSubarray {
    public static void main(String[] args) {

        int[] nums = {2, 6, 4, 8, 10, 9, 15}; // output 5
        System.out.println(findUnsortedSubarray2(nums));
    }

    public static  int findUnsortedSubarray2(int[] nums) {
        int start = -1, end = -2;
        int n = nums.length;
        int max = nums[0], min = nums[n-1];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n-i-1]);
            if (max > nums[i]) end = i;
            if (min < nums[n-i-1]) start = n-i-1;
        }
        return end - start +1;
    }
    public static int findUnsortedSubarray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        // find the max and min value from the array
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                min = Math.min(min, nums[i]);
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                max = Math.max(max, nums[i]);
            }
        }
        // System.out.println(min + " => " + max);
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE)
            return 0;

        // Now calculate the diff of index from start and end
        int start = 0, end = nums.length - 1;
        for (; start < nums.length; start++) {
            if (nums[start] > min)
                break;
        }
        for (; end >= 0; end--) {
            if (nums[end] < max)
                break;
        }
        return end - start + 1;

    }
}
