package Question;
import java.util.Scanner;

public class CheckMultipleOfHundrad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 100 != 0) {
            System.out.println("Please enter a number that is a multiple of 100.");
        } else {
            int fiveHundredCount = num / 500;    
            int remainder = num % 500; 
            int hundredCount = remainder / 100;

            System.out.println("Result: 500 * " + fiveHundredCount + " and 100 * " + hundredCount);
        }

        sc.close();
    }
}
