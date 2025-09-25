package ControlFlowStatement.ifElse;
import java.util.Scanner;

public class NegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem 3 : Check is the given number is negative, Positive or zero
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if(num == 0 ){
            System.out.println("The Number is Zero");
        } else if(num < 0){
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Positive.");
        }
    }
    
}
