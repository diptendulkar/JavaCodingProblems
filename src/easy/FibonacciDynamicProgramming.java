package easy;

import java.util.Arrays;

public class FibonacciDynamicProgramming {

    public static int  findFibbo(int n){
        if(n<=1)
            return n;

        int[] fibbo = new int[n];
        fibbo[0] = 0;
        fibbo[1] = 1;

        for(int i=2; i<n ; i++){
            fibbo[i] = fibbo[i-1] + fibbo [i-2];
        }
      //  Arrays.stream(fibbo).forEach( j ->System.out.println("n = " + j));
        System.out.println(Arrays.toString(fibbo));
        return fibbo[n-1];

    }



    public static void main(String[] args) {
        int n = 6; // Example: finding the nth Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + findFibbo(n));
       
    }
}
