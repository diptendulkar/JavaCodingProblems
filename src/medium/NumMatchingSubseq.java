package medium;

import java.util.HashMap;

public class NumMatchingSubseq {
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        System.out.println(numMatchingSubseq(s, words));
    }

    public static int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        char[] str = s.toCharArray();
        for(String word : words){
            char[] temp = word.toCharArray();
            int i=0,j=0;
            while (i<str.length && j<temp.length){
                if(str[i]==temp[j])
                {
                    i++;
                    j++;
                }else{
                    i++;
                }
            }

            if(j==temp.length){
                count++;
            }

        }

        return count;
    }
}
