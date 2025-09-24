package JavaBasics.Operators;
import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        double ans = Math.pow(a , 2);
        System.out.println("The square of " + a + " is " + ans);
    }
}
