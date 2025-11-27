package Recursion;

public class example1 {


    void printNumber(int n){
        //base Condition
        if(n == 5) return;
        
        n++;
        printNumber(n);
        System.out.println("The value of n is: " + n);
    }


    public static void main(String[] args) {
        example1 ex = new example1();
        int n = 1;
        ex.printNumber(--n);
    }
}
