package DSA.Sorting;

public class mergSortImplementation {
    public static void mergeSort(int[] arr,int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;

            //sort right half arr
            mergeSort(arr,left,mid);

            //sort right half array
            mergeSort(arr,mid+1,right);

            //merg the both half
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int [] arr,int left , int mid, int right)
    {
        

    }
    
}
