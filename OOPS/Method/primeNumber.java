package OOPS.Method;

public class primeNumber {
    
    /*Normal way */
    // public static boolean isPrime(int n){
    //     for(int i=2; i<=n-1; i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    /*optimized way */
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }

}
