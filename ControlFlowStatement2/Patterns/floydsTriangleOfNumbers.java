package ControlFlowStatement2.Patterns;

public class floydsTriangleOfNumbers {
    public static void main(String[] args) {
        /* Print a Floyd’s Triangle of numbers 
         1
         23
         456
         78910
        */
        int sum = 0;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                sum = sum + 1;
                System.out.print(sum);
            }
            System.out.println();
        }

        //method 2
        // int n = 1;
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(n);
        //         n++;
        //     }
        //     System.out.println();
        // }
    }
}
