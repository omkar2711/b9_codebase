package Arrays;

import java.util.Scanner;

public class maxElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        
                for(int i=0; i<arr.length;i++){
                    System.out.print("enter the element "+i+": ");
                    arr[i]=sc.nextInt();
                }
        int max=arr[0];
                for(int i=1; i<arr.length;i++){
                    if(max<arr[i]){
                        max=arr[i];
                    }
                }
        System.out.println(max);
        sc.close();
    }
    
}
