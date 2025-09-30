package ControlFlowStatement2.Loops.doWhileLoop;

import java.util.Scanner;

public class sumOfAllNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        do{
            sum += i;
            System.out.println(sum);
            i++;
        } while(i<=n);

        sc.close();
    }
}
