package DSA.LinearDataStructure.recursion;
//Q16. Implement Merge Sort
//        Write a function mergeSort(arr) that sorts an array using the merge sort algorithm.

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int [] arr,int left,int right){
        if(left<right){
            int mid = left+(right-left)/2;
            //sort left array
            mergeSort(arr,left,mid);

            //sort right Array
            mergeSort(arr,mid+1,right);

            // merge both arrays
            merge(arr,left,mid,right);
        }

    }
    public static void merge(int[] arr,int left,int mid,int right){
        int n1 = mid-left+1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i =0;i<n1;i++){
            L[i]=arr[left+i];
        }
        for(int j =0;j<n2;j++){
            R[j]=arr[mid+j+1];
        }
        //merging logic
        int i =0;
        int j =0;
        int k =left;

        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k]=L[i];
                i++;
            } else if (L[i]>R[j]) {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while( j < n2)
        {
            arr[k]=R[j];
            j++;
            k++;
        }
        while(i < n1)
        {
            arr[k]=L[i];
            i++;
            k++;
        }
    }
    public static void main(String[] args) {
        int [] arr = {38,27,43,3,9,82,10};
        System.out.println("Array Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array After Sorting");
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
