package DSA.Arrays.control_flow_statements.whileLoops;

import java.util.Scanner;

public class NumberDivisibleBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =  sc.nextInt();
        int i =1;
        while(i<=num)
        {
            if(i%5==0 && i%7==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
