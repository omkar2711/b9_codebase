package DSA.CoreJava.control_flow_statements.whileLoops;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i =1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
