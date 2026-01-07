package DSA.Arrays;

import java.util.Scanner;

public class cancatArr {
    
    public static String concat(int n , String[] str){
        String sum = "";
        for(int i=0; i<n; i++){
            sum += str[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arr");
        int n = sc.nextInt();

        String[] str = new String[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the element "+(i+1)+" of arr");
            str[i] = sc.next();
        }

        System.out.println("The Concatenate of arr is ' "+concat(n, str)+" '");

        sc.close();
    }
}
