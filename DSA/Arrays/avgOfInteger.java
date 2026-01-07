package DSA.Arrays;

import java.util.Scanner;

public class avgOfInteger {
    
    public static int findAvg(int n , int[] arr){
        int sum = 0; 
        int avg = 0;
        for(int i=0; i<n; i++){
            avg = (sum += arr[i]) / n;
        }
        return avg;
    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        if(n <= 0 || n > Integer.MAX_VALUE ){
            System.out.println("The number is out of range");
            return;
        }

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the element "+(i+1)+" of arr");
            arr[i] = sc.nextInt();
        }

        System.out.println("The avg of all interger is: "+findAvg(n, arr));


        sc.close();
    }
}
