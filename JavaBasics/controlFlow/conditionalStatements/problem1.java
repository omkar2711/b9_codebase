package JavaBasics.controlFlow.conditionalStatements;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the traffic light: ");
        String light = sc.nextLine();

        if(light.equals("red")) {
            System.out.println("Stop!");
        }
        else if(light.equals("yellow")) {
            System.out.println("Slow Down!");
        }
        else if(light.equals("green")) {
            System.out.println("Go!");
        }
        else{
            System.out.println("Not a valid traffic light!");
        }
    }
}
