package DSA.Arrays.control_flow_statements.if_else;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year to Check weather it is Leap Year or not :-");
        int Year = sc.nextInt();

        if((Year%4 == 0 && Year%100 != 0) || Year%400 == 0)
        {
            System.out.println(Year+ " is Leap Year");
        }
        else
        {
            System.out.println(Year+ " is Not Leap Year");
        }

    }
}
