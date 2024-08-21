package medium;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
        int k1 = 2;
        System.out.println("Maximum consecutive 1's: " + longestOnes(nums1, k1)); // Output: 7

        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 0};
        int k2 = 3;
        System.out.println("Maximum consecutive 1's: " + longestOnes(nums2, k2)); // Output: 6
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0;  // Left boundary of the sliding window
        int right = 0; // Right boundary of the sliding window
        int maxOnes = 0; // Store the maximum number of consecutive 1s
        int zeroCount = 0; // Count of zeros in the current window

        // Loop over the array with the right pointer
        while (right < nums.length) {
            // If the current number is 0, increment the zero count
            if (nums[right] == 0) {
                zeroCount++;
            }

            // If there are more than k zeros in the window, move the left pointer to shrink the window
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++; // Shrink the window
            }

            // Calculate the maximum length of the window
            maxOnes = Math.max(maxOnes, right - left + 1);

            // Move the right pointer to the next position
            right++;
        }

        return maxOnes; // Return the maximum number of consecutive 1s
    }
}
