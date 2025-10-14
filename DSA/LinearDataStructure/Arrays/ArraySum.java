package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum =0;
        for(int i = 0 ; i < num.length ; i++){

            num[i] = i+1;
        }
        for(int i = 0 ; i < num.length ; i++){
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
