package DSA.Arrays.control_flow_statements.Loops;

import java.util.Scanner;

public class ReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            System.out.println(n - i + 1);
        }
        sc.close();
    }
}