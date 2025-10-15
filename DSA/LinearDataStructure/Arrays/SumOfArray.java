package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        if(n <=0 || n >Integer.MAX_VALUE)
        {
            System.out.println("Input is out of range");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of Array Elements is "+findSum(arr));
        System.out.println("Product of Array Elemets is "+findProduct(arr));
        System.out.println("Average of Array Elements is "+findAverage(arr));
        sc.close();
    }
    public static int findSum(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static int findProduct(int[] arr)
    {
        int product = 1;
        for(int i=0;i<arr.length;i++)
        {
            product *=arr[i];
        }
        return product;
    }
    public static double findAverage(int[] arr)
    {
        int sum = findSum(arr);
        double avg=sum/arr.length;
        return avg;
    }
}
