// check if the no is divisible by 5 and 7
import java.util.Scanner;

public class divisibletest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter integer=");
        int n=input.nextInt();

        if(n%5==0 && n%7==0){
            System.out.println("The no is divisible by 5 & 7");
        }
        
    }
}
