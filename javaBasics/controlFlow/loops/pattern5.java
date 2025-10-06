package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class pattern5 {

    public static void main(String [] args){
        int k=0;

        Scanner SC= new Scanner(System.in);
        System.out.println("enter how many rows you want-->");

        int r=SC.nextInt();
         for(int i=0 ;i<r ;i++)
         {
            
            for(int j=0 ; j<=i; j++){
                k++;
                System.out.print(" "+k);
            }System.out.println(" ");
         }
        

    }
    
}
