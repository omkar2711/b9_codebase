package javaBasics.controlFlow.loops;

import java.util.Scanner;

public class naturalNumbers {

    public static void main(String [] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("enter how many natural numbers you want to print:-->");
        int n=SC.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.println(i);
        }

    }
}
