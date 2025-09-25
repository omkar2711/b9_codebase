package JavaBasics.controlFlow.conditionalStatements;

import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if(num == 0){
            System.out.println("Zero");
        }
        else if(num < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }
    }
}
