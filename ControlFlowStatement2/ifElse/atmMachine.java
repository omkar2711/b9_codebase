package ControlFlowStatement2.ifElse;

import java.util.Scanner;

public class atmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Problem 8: Given an amount , check if it's multiply by 100 and 
         calculate the number of 500 and 100 notes  //atm machine */

        System.out.println("Enter an amount to withdraw ");
        int amount = sc.nextInt();

        if(amount % 100 == 0){  
            int count500 = amount / 500;
            int count100 = amount % 500;
            count100 = count100 / 100;
            
            System.out.println("The notes of 500 is: "+count500);
            System.out.println("The notes of 100 is: "+count100);
            System.out.println("Total amount: "+amount);
        } else {
            System.out.println("amount is not multiply by 100.");
        }
        
        sc.close();
    }
}
