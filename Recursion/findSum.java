package Recursion;

public class findSum {
    int sum(int n){

        if(n == 1 || n == 0){
            return 1;
        }

        return  n + sum(n-1);
    }
    public static void main(String[] args) {
        findSum f = new findSum();
        int n = 10;
        int ans = f.sum(n);
        System.out.println("Sum of " + n + " numbers is " + ans);
    }
}



//Print the numbers from 1 to n
//Print the numbers from n to 1
//Find the sum of all natural numbers till n
//find the factorial of n
//print fibonacci series
//find the count of digits in a number

