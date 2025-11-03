package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class LinearSearchAlgo {

    int searchArrayElement(int[] arr,int val)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==val)
            {
                return i;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        LinearSearchAlgo obj = new LinearSearchAlgo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int val = sc.nextInt();
        int index=obj.searchArrayElement(arr,val);
        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at "+index+" position");
        }
        sc.close();
    }
}
