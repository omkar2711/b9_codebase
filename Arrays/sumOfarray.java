package Arrays;

import java.util.Scanner;

public class sumOfarray {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("enter array elemnt "+i+": ");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum of all elements is "+sum);
        sc.close();


    }
    
}
