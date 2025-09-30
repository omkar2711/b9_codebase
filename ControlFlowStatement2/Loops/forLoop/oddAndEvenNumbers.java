package ControlFlowStatement2.Loops.forLoop;

import java.util.Scanner;

public class oddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    //odd number
    // for(int i=1; i<=n; i=i+2){
    //     System.out.println(i);
    // }

    //even number 
    for(int i=0; i<=n; i=i+2){
        System.out.println(i);
    }
    sc.close();
    }
}
