package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class odd {
    public static void main(String [] args){
        Scanner SC=new Scanner(System.in);
        System.out.println("enter till which number you want check odd numbers :-->");
        int num=SC.nextInt();
        for(int i=1;i<=num;i++) {
            if (i % 2 != 0) {
                System.out.println("the number"+i+" is odd");
            }
        }
    }
}
