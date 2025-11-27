package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,8,2};
        int n = arr.length;

        

        //53482 -> 23458
        //i = 4
        //key = 2
        //j = i - 1 = -1
        //arr[j] = 3




        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i - 1;

            //move elements greater that key to one position ahed
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
}
