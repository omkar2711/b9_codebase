package ControlFlowStatement2.Loops.whileLoop;

import java.util.Scanner;

public class divisibleBy5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i<=n){
            if( (i % 5 == 0) && (i % 7 == 0)){
                System.out.println(i);
            }
            i++;
        }

        sc.close();
    }
}
