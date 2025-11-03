package DSA.LinearDataStructure.Arrays;

public class SwapArrayElement {
    void arraySwap(int[] arr)
    {
        int temp;
        int n = arr.length;
        for(int i =0;i<n/2;i++)
        {
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void main(String[] args) {
        SwapArrayElement obj = new SwapArrayElement();
        int [] arr = {1,2,3,4,5};
        obj.arraySwap(arr);
    }
}
