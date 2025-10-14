package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        System.out.println("Enter the Value of the Array");
        int[] arr =new int[size];
        boolean flag = false;
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int search = sc.nextInt();
        for(int i =0;i<size;i++)
        {
            if(arr[i]==search)
            {
                flag=true;
            }else {
                flag=false;
            }
        }
        if(flag==true)
        {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}
