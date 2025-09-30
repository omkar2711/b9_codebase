package parshwa.forloop;
import java.util.Scanner;

//print even no using for loop. take input from user

public class evenno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no=");
        int n=sc.nextInt();

        for(int i=0;i<=n;i=i+2){
            System.out.println(i);
        }
        sc.close();
    }
    
}
