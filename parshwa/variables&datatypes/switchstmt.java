
import java.util.Scanner;

public class switchstmt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter no=");
        int n=sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("invalid input");
        }
        sc.close();
    }
}
