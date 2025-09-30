// take principla amount rate of interest  and duration in year  and calculate simple interest
import java.util.Scanner;

public class simpleint {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int si;

        System.out.println("Enter Principal amount = ");
        int p=sc.nextInt();

        System.out.println("Enter Rate of interest = ");
        int r=sc.nextInt();

        System.out.println("Enter duration years = ");
        int t=sc.nextInt();


        si=(p*t*r)/100;
        System.out.println("Simple interest = "+si);

        sc.close();


    }
    
}
