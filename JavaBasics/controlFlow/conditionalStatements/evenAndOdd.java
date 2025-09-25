package JavaBasics.controlFlow.conditionalStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

//write a program to check whether a number is even or odd





public class evenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
