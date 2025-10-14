package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class ArithmaticOperationUsingArray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Size of the Array:");
            int n = sc.nextInt();
            System.out.println("Enter the Value of Array:");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
        while (true){
            System.out.println("Select Operation \n1.Addition of all Array Emenets.\n2.Substartion of all Array Element.\n3.Multiplication of all Array Element.\n4.Division of all Array Element.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: sum(arr);
                    break;
                case 2: sub(arr);
                    break;
                case 3: mul(arr);
                    break;
                case 4:
                   // div(arr);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }

    public static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void sub(int arr[]) {
        int sub = 0;
        for (int i = 0; i < arr.length; i++) {
            sub = arr[i]-sub;
        }
        System.out.println(sub);
    }

    public static void mul(int arr[]) {
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }
        System.out.println(mul);
    }
}

