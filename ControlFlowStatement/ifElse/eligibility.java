package ControlFlowStatement.ifElse;

import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 4 : Check if the number is eligible for vote (age >= 18)
        System.out.println("Enter the age of person: ");
        int age = sc.nextInt();

        if(age >= 18 ){
            System.out.println("Your are eligible for vote.");
        } else {
            System.out.println("Your are not eligible for vote.");
        }

    }
}
