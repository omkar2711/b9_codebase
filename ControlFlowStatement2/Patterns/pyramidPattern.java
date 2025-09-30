package ControlFlowStatement2.Patterns;

public class pyramidPattern {
    public static void main(String[] args) {
        /*
         * Print a pyramid of stars
             *
            ***
           *****
          *******
         *********
         */
        int n = 10;
        for (int i = 1; i <= n; i+=2) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
