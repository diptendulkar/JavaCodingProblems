package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
//        int[] num = {10,9,2,5,3,7,101,18}; // output 4
//        System.out.println(getSubsequence(num));
        int[] num = {6,2,4,3,7,4,5}; // output 4
       // int[]num ={0,1,0,3,2,3}; // output 4 = 0,1,2,3
        System.out.println(getSubsequence(num));

    }

    public static int getSubsequence(int[] nums){

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        //6,2,4,3,7,4,5
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.println(nums[i] +" > "+ nums[j]);
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);

                    System.out.println("dp["+i+"]=" + dp[i]);
                }
            }
        }

        int maxLength = Arrays.stream(dp).max().orElse(0);
        return maxLength;

      /*  List<Integer> arr = new ArrayList<>();
        for (int i : nums) {
            arr.add(i);
        }

        int maxLen =1;
        int result =0;
        int l=0,r=1;
        int num = arr.get(l);
        //10,9,2,5,3,7,101,18
        while(l< arr.size() && r < arr.size()){


            if(num<= arr.get(r)){
                System.out.println("num:"+num + "   arr["+r+"]"+arr.get(r) + "  maxLen"+maxLen);
                maxLen++;
                result = Math.max(maxLen, result);
                num = arr.get(r);
                r++;

            }
            else{
                System.out.println("num:"+num + "    arr["+r+"]"+arr.get(r) + "  maxLen"+maxLen);
                r++;
            }


            if(r>= arr.size()){
                System.out.println("\n\n --------------------");
                l++;
                r=l+1;
                maxLen=1;
                num = arr.get(l);
            }
        }

      //  result = Math.max(maxLen, result);
        return result;
*/
    }
}
