package DSA.CoreJava.control_flow_statements.forLoop.Patterns;

import java.util.Scanner;

public class SquareHollowPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n ;i++)
        {
            for(int j = 1; j<=n; j++)
            {
               if(i == 1 || j == 1 || i == n || j ==n) {
                   System.out.print("*  ");
               }
               else {
                   System.out.print("   ");
               }
            }
            System.out.println();
        }
    }
}
