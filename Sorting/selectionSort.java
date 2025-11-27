package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,8,8,2};
        
        //23458
    
        int n = arr.length;

        for(int i = 0 ;i< n-1;i++){
            int minIdx = i;


            //find the smallest element
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }

            //swap the found minimum with the first element 
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        System.out.println("Sorted array is:");
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
