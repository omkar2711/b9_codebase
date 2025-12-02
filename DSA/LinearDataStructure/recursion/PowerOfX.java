package DSA.LinearDataStructure.recursion;

import java.util.Scanner;

//X^n
public class PowerOfX {
    static int power(int x, int n)
    {
        if(n==0) return 1;
        return x * power(x, n-1);
    }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the value of X :");
    int X = sc.nextInt();
    System.out.print("Enter the value of n :");
    int n = sc.nextInt();
    System.out.println("Value of "+X+" to the Power "+n+" is "+power(X,n));
}
}
