package for_loop;

import java.util.Scanner;

public class alloddnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        for(int i=1;i<=n;i=i+2){
            System.out.println(i);
        } 
        sc.close();
    }
    
}
