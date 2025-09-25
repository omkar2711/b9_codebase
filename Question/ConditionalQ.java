package Question;
import java.util.Scanner;

public class ConditionalQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        int temp = sc.nextInt();

        if (temp >= 40) {
            System.out.println("It's extremely hot outside!");
        } else if (temp >= 30) {
            System.out.println("It's quite warm outside.");
        } else if (temp >= 24) {
            System.out.println("The weather is pleasant.");
        } else if (temp >= 18) {
            System.out.println("It's a bit chilly.");
        } else {
            System.out.println("It's very cold outside! Stay warm.");
        }

        sc.close();
    }
}
