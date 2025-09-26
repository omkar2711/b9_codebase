package ControlFlowStatement2.ifElse;

import java.util.Scanner;

public class divisibleby5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem 7 : check if the number is divisible by 5 and 7  //35
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 7 ==0){
            System.out.println("This number is divisible by 5 and 7.");
        } else if (num % 5 == 0){
            System.out.println("This number is divisible by 5 but not by 7.");
        } else if (num % 7 == 0){
            System.out.println("This number is divisible by 7 but not by 5.");
        } else {
            System.out.println("This number is not divisible by 5 and 7.");
        }
        



        sc.close();
    }
}
