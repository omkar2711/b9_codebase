package ControlFlowStatement2.Loops.doWhileLoop;

import java.util.Scanner;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //odd number
        int i =1;
        do{
            System.out.println(i);
            i+=2;
        } while(i<=n);

        sc.close();
    }
}
