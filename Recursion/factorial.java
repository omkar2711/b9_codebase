package Recursion;

public class factorial {


    //!5 = 5 x !4
    //!4 = 4 x !3
    //!3 = 3 x !2
    //!2 = 2 x !1

    int fact(int n){

        if(n == 1 || n == 0){
            return 1;
        }

        return  n * fact(n-1);
    }
    public static void main(String[] args) {
        factorial f = new factorial();
        int n = 10;
        int ans = f.fact(n);
        System.out.println("Factorial of " + n + " is " + ans);
    }
}
