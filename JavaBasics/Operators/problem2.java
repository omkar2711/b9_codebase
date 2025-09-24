package JavaBasics.Operators;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name:");
        String name = sc.nextLine();

        System.out.println("Enter hobby:");
        String hobby = sc.nextLine();

        System.out.println("Hello my name is: " + name + " and my hobby is " + hobby + "!");

        sc.close();
    }
}
