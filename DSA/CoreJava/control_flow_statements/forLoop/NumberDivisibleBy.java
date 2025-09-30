package DSA.CoreJava.control_flow_statements.forLoop;

import java.util.Scanner;

public class NumberDivisibleBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a last number: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
        if(i%5==0 && i%7==0)
        {
            System.out.println(i);
        }
        }
        sc.close();
    }
}
