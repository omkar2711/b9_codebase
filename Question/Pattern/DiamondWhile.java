package Question.Pattern;

import java.util.Scanner;

public class DiamondWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = sc.nextInt();
        int z = n / 2 ;
        // for (int i = 1; i <= n; i++) {
        //     if(i <= z ){
        //         for (int j = 1; j <= (2 * i -1); j++) {
        //             System.out.print("*");
        //         }
        //     }else{
        //         for (int j = 1; j <= (2 * (n - i) +1); j++) {
        //             System.out.print("*");
        //         }
        //     }
           
        //     System.out.println();
            
        // }

         int totalRows = 2 * n - 1;
        for (int i = 1; i <= totalRows; i++) {
            int row = i <= n ? i : totalRows - i + 1;
            for (int j = 1; j <= n + row - 1; j++) {
                if (j <= n - row) {
                    System.out.print(" "); // spaces
                } else {
                    System.out.print("*"); // stars
                }
            }
            System.out.println();
        }
        
    }
    
}
