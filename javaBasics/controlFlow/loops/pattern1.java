package javaBasics.controlFlow.loops;
import java.util.*;

public class pattern1 {
     public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter how many rows you want-->");
        int rows =SC.nextInt();

        for (int i = 1; i <= rows; i++) {
         
           for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
        
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        SC.close();
    }
    
}
