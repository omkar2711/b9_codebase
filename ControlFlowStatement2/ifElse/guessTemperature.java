package ControlFlowStatement2.ifElse;
import java.util.*;

public class guessTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem1: guess the Temperature
        System.out.println("Enter the Temperature: ");
        int temp = sc.nextInt();

        if (temp <= 0){
            System.out.println("freeze temperature");
        } else if (temp > 0 && temp <= 18){
            System.out.println("The temperature is cold.");
        }  else if (temp > 18 && temp <= 30){
            System.out.println("The temperature is mild.");
        }  else {
            System.out.println("The temperature is very hot.");
        } 
        
        sc.close();
    }
}
