
import java.util.Scanner;

public class largesmallno {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st no=");
        int a=input.nextInt();

        System.out.println("Enter 2nd no");
        int b=input.nextInt();

        if (a>b){
            System.out.println("1st no is bigger");
        }

        else{
            System.out.println("2nd no is bigger");
        }
    }
}
