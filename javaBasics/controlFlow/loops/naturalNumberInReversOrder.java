package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class naturalNumberInReversOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number from which number till 1 you want to print reversed numbers:-->");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
