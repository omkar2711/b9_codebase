package DSA.Recursion;

public class fibonacciNumber {
    
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }


    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibo(n));
    }
}
