package easy;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
    int[] nums ={1,1,2,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int index =0;

        for(int i=1;i<nums.length;i++){
            if(nums[index] != nums[i]){
                index++;
                nums[index]= nums[i];

            }
        }
        return index+1;
    }
}
