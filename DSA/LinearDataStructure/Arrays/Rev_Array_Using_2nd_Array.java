package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class Rev_Array_Using_2nd_Array {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr2=new int[n];
        for(int i = 0;i<arr.length;i++)
        {
            arr2[i]=arr[arr.length-1-i];
        }
        for(int i = 0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
