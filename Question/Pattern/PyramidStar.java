package Question.Pattern;

import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args){
        //	Print a pyramid of stars:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();
        for (int i = 1; i < input; i++) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i -1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }

        // with 2 loop
        // for (int i = 1; i <= input; i++) {
        //     for (int j = 1; j <= input + i - 1; j++) {
        //         if (j <= input - i) {
        //             System.out.print(" "); // spaces first
        //         } else {
        //             System.out.print("*"); // stars after spaces
        //         }
        //     }
        //     System.out.println();
        // }
    }
    
}
