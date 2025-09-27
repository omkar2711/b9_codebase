//write java program to check no is even or odd
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no to check no is even or odd =");
        int no=sc.nextInt();

        if(no%2==0){
            System.out.println("The no is even");
        }

        else{
            System.out.println("The no is odd");
        }

        sc.close();
    }
}
