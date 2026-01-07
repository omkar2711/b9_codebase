package OOPS.Method;

import java.util.Scanner;

public class AverageOfThree {
    
    public static int avgOfThree(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        System.out.println("Enter number b: ");
        int c = sc.nextInt();
        
        System.out.println("The average of three number is : "+avgOfThree(a, b, c));

        sc.close();
    }
}

