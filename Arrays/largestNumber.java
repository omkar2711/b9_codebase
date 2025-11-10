package Arrays;

import java.util.Scanner;

public class largestNumber {
    public static String maxminvalue(){
        Scanner sc=new Scanner(System.in);
         
        int[] arr=new int[5];
        
        for(int i=0;i<5;i++){
            System.out.println("enter the element in a array. ");
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i =0;i<4;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        sc.close();
        return "largest element : " +max;
    }
    public static void main(String[] args) {
       System.out.println(maxminvalue());
    }
    
}
