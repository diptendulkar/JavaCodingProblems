package medium;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static int[] product(int[] nums){

       /* int n = arr.length;
        int[] result = new int[n];
        int prefeix=1;
        for(int i =0; i< n; i++)
        {
            prefeix = prefeix * arr[i];
        }
        for(int i =0; i< n; i++){
            result[i] = prefeix/arr[i];
        }
        return  result;*/

        int numsLength = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int[] result = new int[numsLength];
        for(int i = 0; i < numsLength; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        System.out.println(result.toString());
        for(int i = numsLength-1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(product(new int[] {1,2,3,4})));
    }
}
