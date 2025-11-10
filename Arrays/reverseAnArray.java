package Arrays;

import java.util.Scanner;

public class reverseAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of element :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        // input array element
        for(int i=0;i<arr.length;i++ ){
            arr[i]=sc.nextInt();
        }

            System.out.print("[ ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ,");
        }
        System.out.print (" ]");
        sc.close();
    }
    
}
