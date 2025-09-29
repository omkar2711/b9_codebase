package javaBasics.controlFlowConditionalStatments;

import java.util.Scanner;

public class problem2 {

    public static void main(String args[]){

        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the current temperature in celsius:-->");
        int temp=SC.nextInt();

        if(temp<=0){
            System.out.println("It's Freezing temperature ");
        }else if(temp>0 && temp <=18){
            System.out.println("it's cold ");
        }else if(temp>18 && temp<=30){
            System.out.println("it's normal temperature");
        }else if(temp>30)
        {
            System.out.println("it's very hot");
        }
        
    }
}
