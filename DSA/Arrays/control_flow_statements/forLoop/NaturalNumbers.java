package DSA.Arrays.control_flow_statements.forLoop;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++)
        {
            System.out.println(i);
        }
        sc.close();
    }
}
