package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class pattern3 {public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter how many rows you want-->");
        int rows =SC.nextInt();

        for (int i = rows; i >= 1; i--) {
        
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        SC.close();
    }
    
}
