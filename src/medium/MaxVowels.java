package medium;

public class MaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));

        countVowels(s);
    }

    public static int maxVowels(String s, int k) {
        int maxLen = 0;

        int[] vowels = new int[26];
        vowels['a' - 'a'] = 1;
        vowels['e' - 'a'] = 1;
        vowels['i' - 'a'] = 1;
        vowels['o' - 'a'] = 1;
        vowels['u' - 'a'] = 1;

        int count = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            count += vowels[ch - 'a'];


            if (right >= k - 1) {

                maxLen = Math.max(maxLen, count);
                char c = s.charAt(left);

                if (vowels[c - 'a'] != 0) {
                    count--;
                }
                left++;
            }
        }
        return maxLen;
    }

    public static void countVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // Count vowel logic here
                count++;
            }
        }
        System.out.println(count);
    }
}
