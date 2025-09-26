package ControlFlowStatement2.ifElse;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 6: Check of the given year if leap year or not
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if(year % 4 ==0){
            if(year % 100  == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year");
                }else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not Leap Year");
        }
        
        
        sc.close();
        //1800 not, 2024, 1600
    }
}
