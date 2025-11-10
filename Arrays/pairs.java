package Arrays;

import java.util.Scanner;

public class pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int num[]={2,4,6,8,10};

        for(int i=0;i<5;i++){
            for(int j =i+1;j<5;j++){
                System.out.print("( "+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
sc.close();
    }
    
}
