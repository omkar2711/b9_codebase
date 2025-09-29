 package Question.Pattern;

import java.util.Scanner;

public class PrintInverterRightAngleTrangel {

    public static void main(String[] args){
        //Print an inverted right-angled triangle 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = sc.nextInt();
        for (int i = input; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}