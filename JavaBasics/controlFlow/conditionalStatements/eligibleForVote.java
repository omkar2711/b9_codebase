package JavaBasics.controlFlow.conditionalStatements;

import java.util.Scanner;

public class eligibleForVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }
    }
}
