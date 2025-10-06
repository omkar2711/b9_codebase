package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class pattern6 {
    public static void main(String [] args){
        char k='A';

        Scanner SC= new Scanner(System.in);
        System.out.println("enter how many rows you want-->");

        int r=SC.nextInt();
         for(int i=0 ;i<r ;i++)
         {
            
            for(int j=0 ; j<=i; j++){
                 
                System.out.print(" "+k);
                k++;
            }System.out.println(" ");
         }
        

    }
    
}
