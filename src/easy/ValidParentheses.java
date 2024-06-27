package easy;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
*/
public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("{()}]"));

    }

    public static boolean isValid(String s) {

        if(s.length() < 2)
            return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['  ){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.size()<= 0)
                    return false;
                char c = stack.peek();
                if(s.charAt(i) == ']' && c == '[')
                    stack.pop();
                else if(s.charAt(i) == '}' && c == '{')
                    stack.pop();
                else if(s.charAt(i) == ')' && c == '(')
                    stack.pop();
                else
                    return false;
            }
        }

        return stack.size()>0 ? false: true;


    }
}
