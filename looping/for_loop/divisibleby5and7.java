package for_loop;

import java.util.Scanner;

public class divisibleby5and7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value: ");
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            if((i%5==0 && i%7==0)){
                System.out.println(i);
            }
        }
         sc.close();
    }
}
