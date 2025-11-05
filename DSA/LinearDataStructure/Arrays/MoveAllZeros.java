package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class MoveAllZeros {
    void moveAllZerosToEnd(int[] arr)
    {
        int j = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        MoveAllZeros s1=new MoveAllZeros();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements :");
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        s1.moveAllZerosToEnd(arr);
    }
}
