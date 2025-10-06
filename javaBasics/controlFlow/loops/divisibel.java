package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class divisibel {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number till which number do you want to search:--> ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%7==0){
                System.out.println("the number is"+i+" divisible by 5 and 7");
            }
        }

    }
}
