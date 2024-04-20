package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
* */
public class RotateImage {
    public static void main(String[] args) {

       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Arrays.stream(matrix)
                .map(Arrays::toString) // Convert each row array to a string
                .forEach(System.out::println); // Print each row string
        System.out.println("\n");
//        Input: matrix = [ [1,2,3],
//                          [4,5,6],
//                          [7,8,9]]
//        Output: [[7,4,1],
//                 [8,5,2],
//                 [9,6,3]]

        rotate(matrix);
        Arrays.stream(matrix)
                .map(Arrays::toString) // Convert each row array to a string
                .forEach(System.out::println); // Print each row string
    }

    public static void rotate(int[][] matrix) {

        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        Arrays.stream(matrix)
                .map(Arrays::toString) // Convert each row array to a string
                .forEach(System.out::println); // Print each row string
        System.out.println("\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}
