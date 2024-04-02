package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountingDistinctPairs {

    public static void main(String[] args) {

        int[] arr ={1,3,1,2};
        int k =1;
        System.out.println(countPairs(arr, k));

    }

    public static int countPairs(int[] arr , int k){
        int count =0;
        Set<Integer> set = new HashSet<>();

        for(int n : arr)
            set.add(n);

        for(int n : set)
            if(set.contains(n-k))
                count++;


        return count;

    }
}
