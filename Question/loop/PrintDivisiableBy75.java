package Question.loop;

import java.util.Scanner;

public class PrintDivisiableBy75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i + " is divisible by both 5 and 7");
            } else if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            } else if (i % 7 == 0) {
                System.out.println(i + " is divisible by 7");
            }
        }
    }
}
