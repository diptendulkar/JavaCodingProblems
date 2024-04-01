package medium;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() < 2)
            return s.length();
        int left = 0;
        int right = 0;
        int resultLength = 0;
        Set<Character> set = new HashSet<>();
        while (left < s.length() && right < s.length()) {
            char ch = s.charAt(right);
            if (!set.contains(ch)) {
                set.add(ch);
               // System.out.println(ch);
                right++;
            } else {
                System.out.println("new Size:" + set.size());
                if (resultLength < set.size())
                    resultLength = set.size();

                set.clear();
                left++;
                right = left;

            }


        }

        return resultLength < set.size() ? set.size() : resultLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
//        System.out.println(lengthOfLongestSubstring(s));
//        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
