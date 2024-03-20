package easy;

public class BinarySearch {

    public static void bSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, mid = 0;
        while (low <= high) {

            mid = low + (high - low) / 2;

            if (target == arr[mid]) {
                System.out.println(" Index is: " + mid);
                break;
            }

            if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    public static void main(String[] args) {

        bSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 1);
    }
}
