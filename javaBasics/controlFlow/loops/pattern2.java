package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter how many rows you want-->");
        int rows =SC.nextInt();

        for (int i = 1; i <= rows; i++) {
         
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        SC.close();
    }
    
}
