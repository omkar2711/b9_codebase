package ControlFlowStatement2.Patterns;

public class DiamondStarPattern {
    public static void main(String[] args) {
        /*
         * Print a pyramid of stars
             *
            ***
           *****
          *******
            ***
             *
         */
        int n = 10; 
        for(int i=1; i<=n; i+=2){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();   
        }
        
        for(int i=n-1; i>=0; i-=2){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
