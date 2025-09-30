package ControlFlowStatement2.Loops.doWhileLoop;

import java.util.Scanner;

public class printNnaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        do{
            System.out.println(i);
            i++;
        } while(i<=n);

        sc.close();
    }    
}
