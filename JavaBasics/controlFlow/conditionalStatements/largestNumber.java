package JavaBasics.controlFlow.conditionalStatements;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();


        if( a > b){
            System.out.println("The largest number is "+a);
        }
        else{
            System.out.println("The largest number is "+b);
        }
    }
}
