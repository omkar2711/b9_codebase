// take name and hobby as input and print it
import java.util.Scanner;

public class stringque {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter your name = ");
        String name = sc.nextLine();

        System.out.println("Enter your hobby =");
        String hobby = sc.nextLine();

        System.out.println("Hello !"+name + "Your hobby is :"+hobby);
        
        sc.close();
    }
    
}
