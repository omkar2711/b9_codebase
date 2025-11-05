package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class secondLargestElement {
     void findFirstSecondThirdMax(int[] arr)
    {
        int first_max=arr[0];
        int second_max=arr[0];
        int third_max=arr[0];
        for(int i = 1; i<arr.length;i++)
        {
            if(arr[i]>first_max)
            {
                third_max=second_max;
                second_max=first_max;
                first_max=arr[i];
            }
            else if(arr[i]>second_max && arr[i]< first_max)
            {
                third_max=second_max;
                second_max=arr[i];
            }
            else if(arr[i]>third_max && arr[i]<second_max)
            {
                third_max=arr[i];
            }
        }
        System.out.println("First Max is : "+first_max);
        System.out.println("Second Max is : "+second_max);
        System.out.println("Third Max is : "+third_max);
    }
   public static void main(String[] args) {
        secondLargestElement s1=new secondLargestElement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements :");
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        s1.findFirstSecondThirdMax(arr);
        sc.close();
    }
}
