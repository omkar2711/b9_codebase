package Searching;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int target = 8;
        boolean isFound = false;

        //linear search
        for(int i = 0;i<n;i++){
            if(arr[i] == target){
                System.out.println("Element found in the array");
                isFound = true;
                return;
            }
        }
        System.out.println("This line is executed");
        if(isFound == false){
            System.out.println("Element not found in the array");
        }

    }
}
