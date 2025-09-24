package javaBasics.controlFlowConditionalStatments;

import java.util.Scanner;

public class signal {
    public static void main(String args[]){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the color of signal light:-->");
        String light=SC.nextLine();

        if(light.equals("red"))
        {System.out.println("STOP");}
        else if(light.equals("yellow")){
            System.out.println("slow Down");

        }else if(light.equals("green")){
            System.out.println("GO!!!");
        }else {System.out.println("ARE BRO LIGHT CHA COLOR MENTION KAR ");}

        
    }
    
}
