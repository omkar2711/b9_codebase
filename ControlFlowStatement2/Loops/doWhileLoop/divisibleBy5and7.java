package ControlFlowStatement2.Loops.doWhileLoop;

import java.util.Scanner;

public class divisibleBy5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        do {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= n);

        sc.close();
    }
}
