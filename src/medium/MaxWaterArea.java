package medium;

public class MaxWaterArea {
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right){
            int currentArea = Math.min(height[left],height[right] ) * ( right-left);
            maxArea = Math.max(maxArea,currentArea);
            System.out.println(maxArea + " => " + currentArea);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
