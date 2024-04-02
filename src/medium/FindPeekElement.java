package medium;

public class FindPeekElement {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {

        int low = 1, high = nums.length - 2, mid = 0;
        if (nums.length == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;
        while (low <= high) {

            mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            else {
                if (nums[mid] > nums[mid - 1])
                    low = mid + 1;
                else
                    high = mid - 1;
            }

        }

        return 0;
    }
}