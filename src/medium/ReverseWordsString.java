package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsString {
    public static void main(String[] args) {
        System.out.println(reverseWords("The Sky is Blue"));
    }

    public static String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        int start=0, end= str.length-1;

        while(start < end){
            String temp = str[end];
            str[end] = str[start];
            str[start] = temp;
            start ++;
            end--;
        }

       // return Arrays.stream(str).collect(Collectors.joining()).trim();
        return String.join(" ", str);


    }
}
