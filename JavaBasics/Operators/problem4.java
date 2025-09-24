package JavaBasics.Operators;

import java.util.Scanner;

public class problem4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        int pa = sc.nextInt();

        System.out.println("Enter the tenure in years:");
        int t = sc.nextInt();

        int year = 2025;



        System.out.println("Enter the per year interest rate: ");
        int r = sc.nextInt();

        int si = (pa * t * r)/100;

        System.out.println("Simple interest rate is: " + si);
    }
}
