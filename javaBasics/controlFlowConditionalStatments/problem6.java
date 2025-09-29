package javaBasics.controlFlowConditionalStatments;

import java.util.Scanner;

public class problem6 {
    public static void main(String args []){
        Scanner SC= new Scanner(System.in);
    System.out.println("Enter any two number-->");
    int a=SC.nextInt();
    int b= SC.nextInt();

    if(a>b){
        System.out.println("A is greater than B");

    }else{System.out.println("B is greater than A");}
        
    }
    
}
