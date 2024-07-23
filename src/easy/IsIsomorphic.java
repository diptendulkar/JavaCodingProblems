package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsIsomorphic {

    public static void main(String[] args) {
        String s = "egg", t = "add";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapChars = new HashMap<>(26);
        Set<Character> setVals = new HashSet<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (mapChars.containsKey(sChars[i])) {
                if (mapChars.get(sChars[i]) != tChars[i])
                    return false;
            } else {
                if (setVals.contains(tChars[i]))
                    return false;
                mapChars.put(sChars[i], tChars[i]);
                setVals.add(tChars[i]);
            }
        }
        return true;
    }
}
