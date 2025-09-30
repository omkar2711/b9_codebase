package ControlFlowStatement2.Patterns;

public class invertedStarPattern {
    public static void main(String[] args) {
         /*
         * Inverted star pattern
         ****
         ***
         **
         *
         */
        // method 1
        for(int i=4; i>=1; i--){
        for(int j=1; j<=i; j++){
        System.out.print("*");
        }
        System.out.println();
        }

        // method 2
        // int n = 4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }
    }
}
