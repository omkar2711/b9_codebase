package JavaBasics.controlFlow.conditionalStatements;

import java.util.Scanner;

//Check if the number is divisible by 5 and 7
public class divibleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        if(num % 5 == 0 && num % 7 == 0){
            System.out.println("Divisible by 5 and 7");
        }
        else if(num % 5 == 0 && num % 7 != 0){
            System.out.println("Divisible by 5 and but not by 7");
        }
        else if(num % 5 != 0 && num % 7 == 0){
            System.out.println("Divisible by 7 and but not by 5");
        }
        else{
            System.out.println(" not divisible by 5 and 7");
        }
    }
}
