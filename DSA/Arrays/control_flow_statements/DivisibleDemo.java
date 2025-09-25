package DSA.Arrays.control_flow_statements;

import java.util.Scanner;

public class DivisibleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check is it Divisible by 5 and 7 :- ");
        int num1 = sc.nextInt();

        if (num1%5 == 0 && num1%7 == 0)
        {
            System.out.println("Divisible by 5 and 7");
        }
        else
        {
            System.out.println("Not Divisible by 5 and 7");
        }
        sc.close();
    }
}
