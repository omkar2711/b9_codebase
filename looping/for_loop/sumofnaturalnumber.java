package for_loop;

import java.util.Scanner;

public class sumofnaturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value :");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            sum=sum+i;

        }
        System.out.println("sum of all natural number from 1 to "+n +" = "+ sum);
         sc.close();
    }
}
