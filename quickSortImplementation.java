public class quickSortImplementation {


    public static void quickSort(int[] arr , int low, int high){
        if(low < high){
            int pivotIdx = partition(arr, low, high);

            //recursively sort the left part
            quickSort(arr, low , pivotIdx-1);

            //recursively sort the right part
            quickSort(arr, pivotIdx+1 , high);
        }
    }


    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low - 1; 

        for(int j = low; j < high ;j++){
            if(arr[j] < pivot){
                i++;


                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        //place the element at its right position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;


        return i+1;
    }
{

}    public static void main(String[] args) {
        int[] arr = {10,7,8,9,2,1,4,5};
        int n = arr.length;

        System.out.println("Original Array: ");
        for(int i = 0;i<n;i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();


        quickSort(arr, 0, n-1);

        System.out.println("Array after sorting");
        for(int i = 0;i<n;i++){
            System.out.print( arr[i] + " ");
        }
    }
}
