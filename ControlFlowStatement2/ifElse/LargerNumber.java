package ControlFlowStatement2.ifElse;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 5 : Take two numbers as input and print the largest one
        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second Number: ");
        int num2 = sc.nextInt();

        if(num1 == num2 ){
            System.out.println("The both number is equal: "+num1+ "=" +num2);
        } else if(num1 > num2){
            System.out.println("The first number is greater than second number: " +num1+ ">" +num2);
        } else {
            System.out.println("The first number is less than second number: "+num1+ "<" +num2);
        }

        sc.close();
    }
}
