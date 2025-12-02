package DSA.LinearDataStructure.recursion;
import java.util.Scanner;
public class Palindorm {

    static int reverse(int n,int rev){
        if(n==0) return rev;
        return reverse(n/10,rev*10+(n%10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev =reverse(num,0);
        if(rev==num){
            System.out.println(num+" is a Palindorm");
        }
        else
        {
            System.out.println(num+" is not a Palindorm");
        }
    }
}
