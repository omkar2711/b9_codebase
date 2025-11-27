package Searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 18;
        int n = arr.length;
        boolean isFound = false;

        int low = 0;
        int high = n - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == target){
                System.out.println("Element Found");
                isFound = true;
                break;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(isFound == false){
            System.out.println("Element not found");
        }
    }
}
