package Question.Pattern;

import java.util.Scanner;

public class InvertedPyramidWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numer of row ");
        int n = sc.nextInt();
        int i = n;
        while (i >= 1) {
             int k = 1;
            while(k <= n - i){
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while(j <= (2 * i - 1)){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
    
}
