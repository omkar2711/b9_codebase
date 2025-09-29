package Question.loop;

import java.util.Scanner;

public class PrintReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse = sc.nextInt();
        for (int i = 1; i <= reverse; i++) {
            System.out.println(reverse - i + 1);
        }
        sc.close();
    }
}
