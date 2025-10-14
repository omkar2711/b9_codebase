package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class StudentName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of student you want to Store");
        int n = sc.nextInt();
        System.out.println("Enter Student Name:");
        String[] StudName= new String[n];
        for(int i = 0 ; i < n ; i++){
            StudName[i] = sc.next();
        }
        for(int i = 0 ; i < n-1 ; i++){
            System.out.println(StudName[i]);
        }
    }
}
