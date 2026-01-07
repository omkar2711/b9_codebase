package DSA.Arrays;

import java.util.Scanner;

public class productOfInteger {
    
    public static int findProduct(int n , int[] arr){
        int product = 1;
        for(int i=0; i<n; i++){
            product *= arr[i];
        }
        return product;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        if(n<=0 || n >= Integer.MAX_VALUE){
            System.out.println("");
            return;
        }

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the element "+i+1+" of arr");
            arr[i] = sc.nextInt();
        }

        System.out.println("The multiplication of all integer : "+findProduct(n, arr));

        sc.close();
    }
}
