package ControlFlowStatement2.Patterns;

public class rectAngleTringle {
    public static void main(String[] args) {   
        /*
         * Start pattern
         *
         **
         ***
         ****
         * ans:
         */
        for(int i=1; i<=4; i++){
        for(int j=1; j<=i; j++){
        System.out.print("*");
        }
        System.out.println();
        }
    }
}
