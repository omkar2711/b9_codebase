package DSA.LinearDataStructure.recursion;

import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigit(n/10);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Sum of All Digits in "+n+" is "+sumOfDigit(n));
    }
}
