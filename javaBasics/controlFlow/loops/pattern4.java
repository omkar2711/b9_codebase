package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter how many rows you want-->");
        int rows =SC.nextInt();

      for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        SC.close();
    }
    
}




      