public class mergeSortImplementation {

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid =  left + (right - left)/2;  // (left + right) / 2 


            //step1 : sort left array
            mergeSort(arr, left , mid);

            // step2: sort right half
             mergeSort(arr, mid+1 , right);

             //step3: Merge the bolth halves
             merge(arr, left, mid, right);

        }
    }

     public static void merge(int[] arr, int left, int mid, int right){

        //lenght of the arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //temp array
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0;i<n1;i++){
            L[i] = arr[left + i];
        }

        for(int i = 0;i<n2;i++){
            R[i] = arr[mid + 1 + i];
        }

        //Merging Logic
        int i = 0; 
        int j = 0;
        int k = left;

        while( i < n1 && j < n2){
            if(L[i] < R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while( j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
        while( i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

    }


    public static void main(String[] args) {
        System.out.println("Merge Sort Implementation");

        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;
        System.out.println("Original Array:");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Array after sorting:");

        mergeSort(arr, 0 , n-1);

        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }


    }
}
