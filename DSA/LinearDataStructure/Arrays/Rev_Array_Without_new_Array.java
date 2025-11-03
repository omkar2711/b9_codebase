package DSA.LinearDataStructure.Arrays;
import java.util.Scanner;
public class Rev_Array_Without_new_Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements in Array");
        int arr_last_element = arr.length-1;
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp ;
        for(int i = 0;i<(arr.length)/2;i++)
        {
            temp = arr[i];
            arr[i]= arr[arr_last_element-i];
            arr[arr_last_element-i]= temp;
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
