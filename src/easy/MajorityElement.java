package easy;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {

    int[] nums = {2,2,1,1,1,2,2};
        Arrays.sort(nums);
        int maxCount=0;
        int count=0;
         int num= nums[0];

        for(int i=1; i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                count++;
                if(count> maxCount) num = nums[i];
                maxCount = Math.max(maxCount,count);

            }
            else{
                count=0;
            }
        }

        System.out.println(maxCount + " Number : " + num);
    }
}
