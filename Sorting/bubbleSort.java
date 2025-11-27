package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,8,2};
        int n = arr.length;

        //TC : O(n^2)

        //i = 3  j = 0
        //53482.   
        //35482
        //34582
        //34528

        //34258
        //32458
        //23458

        for(int i = 0;i<n-1;i++){
            boolean flag = false;
            for(int j = 0 ; j<n-1-i;j++){
                if(arr[j] > arr[j+1]){

                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    flag = true;
                }
            }
            if(!flag) break;
        }

        System.out.println("Sorted Array is: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
