package javaBasics.controlFlow;

import java.util.Scanner;

public class problem5 {
    public static void main(String args[]){

    Scanner SC=new Scanner(System.in);
     System.out.println("enter age:-->");
     int age=SC.nextInt();

     if(age >= 18){
        System.out.println("You are elegibel for vote");
     }else{System.out.println("Sorry you are not eligible for voting");}
    }
    
}
