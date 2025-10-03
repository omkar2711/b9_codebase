package while_loop;

import java.util.Scanner;

public class reverse_naturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value : ");
        int n =sc.nextInt();

        int i=1;
        while(i<=n){
            System.out.println(n-i+1);
            i++;
        }
         sc.close();
    }
    
}
