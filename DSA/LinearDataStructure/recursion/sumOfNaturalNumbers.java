package DSA.LinearDataStructure.recursion;


import java.util.Scanner;

public class sumOfNaturalNumbers {
    static int printN(int n)
    {
        if(n==1)return n;
        return n+ printN(n-1);
    }
    static void main(String[] args) {
        System.out.println("Enter the Nth natural number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printN(n));
    }
}