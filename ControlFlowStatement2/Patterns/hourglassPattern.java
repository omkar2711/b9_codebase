package ControlFlowStatement2.Patterns;

public class hourglassPattern {
    public static void main(String[] args) {
        /* Print an hourglass pattern
         *****
          ****
           ***
            **
             *
             * 
            **
           ***
          ****  
         *****
        */
        int n=5;
        for(int i=n; i>=1; i--){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
