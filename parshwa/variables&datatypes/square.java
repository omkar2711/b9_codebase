
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no=");
        int no=sc.nextInt();

        int a=no*no;
        System.out.println("Square of no ="+a);

        sc.close();

    }
    
}
