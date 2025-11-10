package Arrays;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //input array length
        System.out.print("enter the array length : ");
        int n=sc.nextInt();

        //creating and initializing the array
        int[] num=new int[n];

        //input array element 
        for (int i=0;i<n;i++){
            System.out.println("enter array element: "+ i);
            num[i]=sc.nextInt();
        }
        for(int i=n-1; i>0 ; i--){
            System.out.print(num[i] + ",");
        }
        sc.close();
    }
    
}
