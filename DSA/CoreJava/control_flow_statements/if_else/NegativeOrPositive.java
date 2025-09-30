package DSA.CoreJava.control_flow_statements.if_else;

import java.util.Scanner;

public class NegativeOrPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Negative number");
        } else if (num == 0) {
            System.out.println("Zero");
        }else {
            System.out.println("Positive number");
        }
        sc.close();
    }
}
