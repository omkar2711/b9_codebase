package DSA.LinearDataStructure.Arrays;
import java.util.Scanner;

public class MinMax {
    static void findMax(int[] arr)
    {
        int max_arr=arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]>max_arr)
            {
                max_arr=arr[i];
            }
        }
        System.out.println("Maximum array Element:"+max_arr);
    }
    static void findMin(int[] arr)
    {
        int min_arr=arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]<min_arr)
            {
                min_arr=arr[i];
            }
        }
        System.out.println("Minimum array Element:"+min_arr);
    }
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
        findMax(arr);
        findMin(arr);
        sc.close();
    }
}
