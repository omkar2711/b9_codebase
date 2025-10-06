package javaBasics.controlFlow;

import java.util.Scanner;

public class problem4 {
    public static void main(String args[]){

     Scanner SC=new Scanner(System.in);
     System.out.println("enter the number:-->");
     int num=SC.nextInt();
     if(num==0)
     {
        System.out.println("this number is zero");

     }else if(num<0)
     {
        System.out.println("this number is negative");
     }else if(num>0)
     {
        System.out.println("this number is positive");
     }

    }

    

    
    

    
}
