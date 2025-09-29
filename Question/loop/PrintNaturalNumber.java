package Question.loop;

import java.util.Scanner;

public class PrintNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
