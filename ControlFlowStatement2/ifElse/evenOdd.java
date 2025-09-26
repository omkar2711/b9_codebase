package ControlFlowStatement2.ifElse;
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 2: Write a program to check whether a number is even or odd
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is Odd.");
        }

        sc.close();
    }
    
}
