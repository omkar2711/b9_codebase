package DSA.basic.control_flow_statements.if_else;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is Even or Odd");
        int num  = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
        sc.close();
    }
}
