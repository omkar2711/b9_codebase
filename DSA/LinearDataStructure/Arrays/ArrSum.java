package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

//Write a Java program that takes a 2D integer array as input from the user and returns the sum of all
//its elements.
//Input:
//
//        3          //no. of rows
//        3          //no. of columns
//        1 2 3      //elements
//        4 5 6
//        7 8 9
//Output = 45
public class ArrSum {

    int SumOfArray(int[] arr)
    {
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row in an array");
        int row = sc.nextInt();
        System.out.println("Enter the number of Columns in an array");
        int col = sc.nextInt();
        int [][] arr= new int [row][col];
        System.out.println("Enter the Elements of an Array");
        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0; j< arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
       }
        int sum = 0;
        System.out.println("ELements of array is : ");
        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0; j< arr.length;j++)
            {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
