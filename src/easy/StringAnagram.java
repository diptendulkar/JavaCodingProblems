package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringAnagram {
    public static void main(String[] args) {
        String a = "hello";
        String b = "olleh";
        System.out.println(isAnagram(a, b));

    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] map = new int[26];
        a = a.toLowerCase();
        b = b.toLowerCase();

        for(char c: a.toCharArray()){
            map[c-'a']++;
        }

        for(char c: b.toCharArray()){
            map[c-'a']--;
        }

        for(int m: map){
            if(m != 0) return false;
        }

        return true;
    }
}
