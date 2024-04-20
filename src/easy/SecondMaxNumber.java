package easy;

// Find 2nd Max
public class SecondMaxNumber {
    public static void main(String[] args) {
        int[] arr = {8,8,8,8,8};

        int max=0, max2 =0;
        int left=0, right= arr.length -1;

        while (left < right){

            if(arr[left] > max){
                max2 = max;
                max = arr[left];
            }
            if(arr[right] > max){
                max2 = max;
                max = arr[right];
            }

            if(arr[left] > max2 && arr[left] < max){
                max2 =  arr[left];
            }
            if(arr[right] > max2 && arr[right] < max){
                max2 =  arr[right];
            }

            left++;
            right--;

        }
        System.out.println(max2);
    }
}
