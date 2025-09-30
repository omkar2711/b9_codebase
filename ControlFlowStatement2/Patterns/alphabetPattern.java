package ControlFlowStatement2.Patterns;

public class alphabetPattern {
    public static void main(String[] args) {
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
    }
}
