package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {

        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");
        if (pattern.length() != str.length)
            return false;

        HashMap<Character, String> list = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {

            if (!list.containsKey(pattern.charAt(i))) {
                if (list.containsValue(str[i])) {
                    return false;
                }
                list.put(pattern.charAt(i), str[i]);
            } else if (!list.get(pattern.charAt(i)).equals(str[i])) {
                return false;
            }


        }

        return true;

    }
}
