package ControlFlowStatement2.nestedLoop;

public class starPatterns {
    public static void main(String[] args) {

        /*
         * Start pattern
         *
         **
         ***
         ****
         * ans:
         */
        // for(int i=1; i<=4; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /*
         * Inverted star pattern
         ****
         ***
         **
         *
         */
        // method 1
        // for(int i=4; i>=1; i--){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // method 2
        // int n = 4;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=n-i+1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }







        /*
         * Print a pyramid of stars
             *
            ***
           *****
          *******
         *********
         */
        // int n = 10;
        // for (int i = 1; i <= n; i+=2) {
        //     for (int j = 1; j <=n-i+1; j++) {
        //         System.out.print(" ");
        //     }

        //     for (int j=1; j<=i; j++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }



        /*
         * Print a pyramid of stars
             *
            ***
           *****
          *******
            ***
             *
         */
        // int n = 10; 
        // for(int i=1; i<=n; i+=2){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();   
        // }
        
        // for(int i=n; i>=0; i-=2){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        /* Half pyramid pattern
         1
         12
         123
         1234
         */
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     } 
        //     System.out.println();
        // }

        /* Print numbers in reverse triangle:
            12345
            1234
            123
            12
            1
         */
        // int n=5;
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        /* 
             *
            ** 
           ***
          ****
         *****
         */
        // int n=5; 
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

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
        // int n=5;
        // for(int i=n; i>=1; i--){
        //     for(int j=n-i; j>=1; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        /* Print a Floyd’s Triangle of numbers 
         1
         23
         456
         78910
        */
        // int sum = 0;
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         sum = sum + 1;
        //         System.out.print(sum);
        //     }
        //     System.out.println();
        // }


        /*	Print an increasing alphabet pattern
         A
         AB
         ABC
         ABCD
         */
        char ch = 'D';
        for(char i='A'; i<=ch; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }













        // jamal nahi

        /*	Print a checkerboard pattern (5x5)
         *****
          *****
         *****
          *****
         *****
         */
        // int n=5;
        // for(int k=1; k<=n; k++){
        //     for(int j=1; j<k; j++){
        //         System.out.print(" ");
        //     }
        //     for(int i=1; i<=n; i++){
        //         System.out.print(" *");
        //     }
            
        //     System.out.println(); 
 
        // }
    }
}
