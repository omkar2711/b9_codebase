package Arrays;

import java.util.Scanner;

public class searchElement {
    public static String search(int arr[],int target){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return "target foun at index: " + i;
            }
        }
        return "target not found.";

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        
        search(arr, target);
        

        sc.close();
    }
    
}
