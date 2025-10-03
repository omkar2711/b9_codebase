package for_loop;

import java.util.Scanner;

public class reverse_naturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value : ");
        int n=sc.nextInt();

        // for(int i=n;i>=1;i--){
        //     System.out.println(i);
        // }
        
        for(int i=1;i<=n;i++){
            System.out.println(n-i+1);
        }
         sc.close();
    }
    
}
