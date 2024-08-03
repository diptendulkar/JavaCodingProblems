package medium;

public class StringCompression {
    public static void main(String[] args) {
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(input));
        System.out.println(input);
    }

    public static int compress(char[] chars) {
        int ans = 0; // Keep track of current position in compressed array
        int n = chars.length; // Cache the length of the array for reuse

        for (int i = 0; i < n;) {
            char letter = chars[i]; // Current character being compressed
            int count = 0; // Count of consecutive occurrences of letter

            // Count consecutive occurrences of letter in input array
            while (i < n && chars[i] == letter) {
                count++;
                i++;
            }

            // Write letter to compressed array
            chars[ans++] = letter;

            // If count is greater than 1, write count as string to compressed array
            if (count > 1) {
                // Convert count to string and write each character to the array
                String countStr = String.valueOf(count);
                for (int j = 0; j < countStr.length(); j++) {
                    chars[ans++] = countStr.charAt(j);
                }
            }
        }

// Return length of compressed array
        return ans;

    }
}
