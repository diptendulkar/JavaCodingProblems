package easy;

public class IsSubsequence {
    public static void main(String[] args) {
//        String s = "abc", t = "ahbgdc";
       // Output: true
        String s = "axc", t = "ahbgdc";
//        Output: false

        System.out.println(isSubsequence(s,t));
    }

    public static  boolean isSubsequence(String s, String t) {
        int i=0,j=0;

        while (i< s.length() && j<t.length()){
            if(s.charAt(i)== t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        System.out.println(i);
        return i == s.length();

    }
}
