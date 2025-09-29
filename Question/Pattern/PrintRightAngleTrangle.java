package Question.Pattern;

import java.util.Scanner;

public class PrintRightAngleTrangle {
    public static void main(String[] agrs){
        // print right angle trangle
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}