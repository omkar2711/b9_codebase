package Question.Pattern;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                if (i == 1 || i == input || j == 1 || j == input) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // for (int i = 1; i <= input; i++) {
        //     if(i == 1 || i == input){
        //         for (int j = 1; j <= input; j++) {
        //             System.out.print("*");
        //         }
        //     }else{
        //         System.out.print("*");
        //         for (int k = 1; k < input-1; k++) {
        //             System.out.print(" ");
        //         }
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }
        
    }
    
}
