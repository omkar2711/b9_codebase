package DSA.LinearDataStructure.recursion;

import java.util.Scanner;

public class CountDigits {
    public static int countDigitInNumber(int n,int count){
        if(n==0) return count;
        return countDigitInNumber(n/10,count+=1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(countDigitInNumber(n,0));
    }
}
