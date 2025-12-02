package DSA.LinearDataStructure.recursion;

import java.util.Scanner;

public class ProductOfNumbersFrom1toN {
    static int product(int n) {
        if (n == 1) {
            return 1;
        }
        return n * product(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = product(n);
        System.out.println("Product of numbers from 1 to " + n + " is: " + result);
    }
}
