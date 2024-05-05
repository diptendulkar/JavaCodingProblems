package easy;
//https://leetcode.com/problems/backspace-string-compare/

/*Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.
Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".*/

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
//    String s = "ab#c", t = "ad#c";
        String s = "a#c", t = "b";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        return processString(s).equals(processString(t));
    }

    private static String processString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
