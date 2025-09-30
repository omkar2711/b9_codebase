package DSA.CoreJava.control_flow_statements.whileLoops;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=n)
        {
            sum  = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
