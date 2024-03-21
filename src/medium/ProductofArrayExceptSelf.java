package medium;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static int[] product(int[] arr){

        int n = arr.length;
        int[] result = new int[n];
        int prefeix=1;
        for(int i =0; i< n; i++)
        {
            prefeix = prefeix * arr[i];
        }
        for(int i =0; i< n; i++){
            result[i] = prefeix/arr[i];
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(product(new int[] {1,2,3,4})));
    }
}
