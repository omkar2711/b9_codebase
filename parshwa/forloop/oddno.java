package parshwa.forloop;

import java.util.Scanner;

public class oddno {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter no=");
        int n=in.nextInt();

        System.out.println("odd nos are=");
        for(int i=1;i<=n;i=i+2){
            System.out.println(i);
        }
    }
    
}
