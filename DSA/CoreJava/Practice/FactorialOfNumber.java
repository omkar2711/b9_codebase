package DSA.CoreJava.Practice;

import java.util.Scanner;

public class FactorialOfNumber {
   static void factorailOfNumber(int n){
        int fact = 1;

        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
       System.out.println("Factorial of "+n+" is "+fact);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        factorailOfNumber(n);
    }
}
