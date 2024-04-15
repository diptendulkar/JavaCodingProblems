package coreJava;

import java.util.Arrays;

public class FindMedian {

    public static void main(String[] args) {
        int[] b = {1, 11, 9, 15, 14, 2, 17, 3, 16, 18};
        int len = b.length;
        int mid =0;
        // Check if the length is odd or even
        if (len % 2 != 0) {
            // If odd, median is the middle element
            mid =   len / 2;
        } else {
            // If even, median is the average of two middle elements
            mid =   ( (len - 1) / 2 +  len / 2) / 2;
        }
        System.out.println("MEDIAN :" + mid);
        //sort using collection
        Arrays.sort(b);
        //sort using stream API any one cal be used
        int[] a = Arrays.stream(b).sorted().toArray();
        System.out.println("\nMedian is:" + b[(int) mid]);
    }
}
