package DSA.basic.control_flow_statements.if_else;

import java.util.Scanner;

public class TempDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Current Temprature :-");
        int temp = sc.nextInt();

        if (temp < 0)
        {
            System.out.println(" Temprature is Frozen");
        }
        else if(temp > 0 && temp < 18)
        {
            System.out.println(" Temprature is Cold");
        }
        else if (temp >= 18 && temp < 30) {
            System.out.println(" Temprature is Normal");
        }
        else {
            System.out.println(" Temprature is High");
        }
        sc.close();
    }
}
