package for_loop;

import java.util.Scanner;

public class naturalnouser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        for(int i=0;i<=n;i=i+2){
            System.out.println(i);
        }
         sc.close();
    }
}
