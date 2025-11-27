package Recursion;

public class fibo {

//0 1 1 2 3 5 8 13 21 34 55...

    int printFibo(int n){
        if(n == 1 || n == 0){
            return n;
        }

        return printFibo(n-1) + printFibo(n-2);
    }
    public static void main(String[] args) {
        fibo f = new fibo();
        int n = 10;

        System.out.println(f.printFibo(n));
        // for(int i = 0;i<=n;i++){
        //     System.out.print(f.printFibo(i) + " ");
        // }
        
    }
}
