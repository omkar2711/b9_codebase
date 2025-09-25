package DSA.Arrays.control_flow_statements;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number 1 :-");
       int a = sc.nextInt();
        System.out.println("Enter Number 2 :-");
       int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else {
            System.out.println(a + " is less than " + b);
        }
        sc.close();
    }
}
