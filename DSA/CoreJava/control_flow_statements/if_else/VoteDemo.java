package DSA.CoreJava.control_flow_statements.if_else;

import java.util.Scanner;

public class VoteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of Person who want to Vote :- ");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("You Can Vote");
        }
        else {
            System.out.println("You Can Not Vote");
        }
        sc.close();
    }
}
