package Question.loop;

import java.util.Scanner;

public class CalculateNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int natural = sc.nextInt();
        // calculate natural number
        int total = 0;
        for (int i = 1; i < natural; i++) {
            total += i;
        }
        System.out.println(total);  
    }
}
