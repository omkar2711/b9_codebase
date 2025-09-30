package DSA.basic.control_flow_statements.whileLoops;

import java.util.Scanner;

public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        sc.close();
    }
}
