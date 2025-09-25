package JavaBasics.controlFlow.conditionalStatements;

import java.util.Scanner;

//Given an amount, check if it's a multiple of 100 and calculate the number of 500 and 100 notes.
public class atmMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");

        int amount = input.nextInt();

        if(amount % 100 == 0){
            int count500 = amount / 500;
            int count100 = amount % 500;
            count100 = count100 / 100;


            System.out.println("500: "  + count500);
            System.out.println("100: "  + count100);
            System.out.println( "amount: "+ amount );
        }
        else{
            System.out.println("Entered amount is not divisible by 100");
        }
    }
}
