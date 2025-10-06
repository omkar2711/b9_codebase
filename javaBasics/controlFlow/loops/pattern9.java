package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {

         Scanner SC= new Scanner(System.in);
        System.out.println("enter number you want-->");

        int n=SC.nextInt();
        
           
            if (n % 5 == 0 && n % 7 == 0) {
                System.out.println(n + " is divisible by both 5 and 7");
            }else {System.out.println(n + " is not divisible by both 5 and 7");}
        
    }
    
}
