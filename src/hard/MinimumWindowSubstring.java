package hard;

import java.util.HashMap;

/*Given two strings s and t of lengths m and n respectively, return the minimum window
 substring
of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
The testcases will be generated such that the answer is unique.
Example 1:
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.*/
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC"; // output BANC
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        int i=0;
        int j=0;
        int ansSize=Integer.MAX_VALUE;
        int n=s.length();
        int m=t.length();
        int count=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int k=0;k<m;k++){
            hm.put(t.charAt(k),hm.getOrDefault(t.charAt(k),0)+1);
        }
        String ans="";

        while(j<n){
            if(hm.getOrDefault(s.charAt(j),0)>0){
                count++;
            }
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)-1);
            while(count==m){

                if(count==m && j-i+1<ansSize){
                    ansSize=j-i+1;
                    ans=s.substring(i,j+1);
                }
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
                if(hm.get(s.charAt(i))>0){
                    count--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
