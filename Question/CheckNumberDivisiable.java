package Question;
import java.util.Scanner;

public class CheckNumberDivisiable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 7 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 7 and 5.");
        } else if (num % 7 == 0) {
            System.out.println(num + " is divisible by 7.");
        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 7 or 5.");
        }

        sc.close();
    }
}
