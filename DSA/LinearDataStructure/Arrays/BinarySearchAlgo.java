package DSA.LinearDataStructure.Arrays;
import java.util.Arrays;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 10, 16, 17};
        Arrays.sort(arr);

        int target = 16;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found: " + arr[mid] + " at index " + mid);
                break;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
