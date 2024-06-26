package easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};

        int arr2[] = {2, 4, 6, 8};


        int arr3[] = mergeArrays(arr1, arr2);

        System.out.println("Array after merging - " + Arrays.toString(arr3));
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int len = arr1.length + arr2.length;
        int[] arr3 = new int[len];

        int i=0, j=0, k=0;

        while(j< arr1.length   && k< arr2.length){

            if(arr1[j]< arr2[k]) {
                arr3[i] = arr1[j];
                j++;
            }else{
                arr3[i] = arr2[k];
                k++;
            }
            i++;


        }

        while(arr1.length >j){
            arr3[i]=arr1[j];
            j++;
            i++;
        }
        while(arr2.length >k){
            arr3[i]=arr2[k];
            k++;
            i++;
        }

        return arr3;
    }
}
