package conditionalstatement;
import java.util.Scanner;
public class largestintwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("first number is greater.");
        }else{
            System.out.println("second is greater.");
        }
        sc.close();
    }
}
