package javaBasics.controlFlow.loops.whileLoop;

import java.util.Scanner;
public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter number you want check :-->");
        int n = SC.nextInt();
        int i=n;

        while (i==n) {
            if (i % 2 == 0) {
                System.out.println("the number" + i + " is even ");
            }else{
                System.out.println("the number" + i + " is odd ");
            }
            i++;
        }
    }
}

