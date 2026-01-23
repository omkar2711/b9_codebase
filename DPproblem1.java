
//memoization : top - down Approach, recursion

// class DPproblem1 {

//      static int[] dp = new int[100];
//         static int fib(int n){
//             if(n<= 1){
//                 return n;
//             }

//             if(dp[n] != 0){
//                 return dp[n];
//             }
//             //6.     5=3       4=2 
//             dp[n] = fib(n-1) + fib(n-2);
//             return dp[n];
//         }

//     public static void main(String[] args) {
//        System.out.println(fib(6));
//     }
// }

// Tabulation (Bottom up approach)
class DPproblem1 {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n+1];

        //0 1 2 3 4 5 6

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }
}