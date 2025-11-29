package DSA.LinearDataStructure.recursion;

public class print1ToN {
    void fibonacii(int s, int t1 ,int t2){
       int sum = t1+t2;
    }
    void abc(int n)
    {
        if(n==0) return;
        if(n==10) return;
        System.out.print(n+" ");
        abc(n+1);
    }
    int factorial(int n)
    {
        if(n==0 || n==1) {
            return 1;
        }
       return n* factorial(n-1);
    }
    int sum(int n)
    {
        if(n==0) return n;
        n = n+sum(n-1);
        return n;
    }
    public static void main(String[] args) {
        print1ToN obj = new print1ToN();
        obj.abc(1);
        System.out.println(obj.factorial(5));
        System.out.println(obj.sum(6));
        int t1 = 0;
        int t2= 1;
    }
}
