package parshwa.oops.practice;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking a number input
        System.out.println("Enter first number:");
        float n1=sc.nextFloat();

        System.out.println("Enter second number:");
        float n2=sc.nextFloat();

        System.out.println("Menu:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Exit");
        int choice = sc.nextInt();
        float result;

        switch(choice){
            case 1:
                result=n1+n2;
                System.out.println("Addition is: " + result);
                break;
            case 2:
                result=n1-n2;
                System.out.println("Subtraction is: " + result);
                break;
            case 3:
                result=n1*n2;
                System.out.println("Multiplication is: " + result);
                break;
            case 4:
                if(n2!=0){
                    result=n1/n2;
                    System.out.println("Division is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        System.out.println("Exiting the program.");
    }

}

        

