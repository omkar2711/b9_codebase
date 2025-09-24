package Basic_java;
import java.util.Scanner;;

public class UserInput {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Enter the hobby: ");
        String hobby = sc.nextLine();

        System.out.println("My name is "+name+ " and my hobby is "+hobby);
        sc.close(); */


        //Write a java program to swap the values of two variables with using a temporary variable.
        // int a = 10;
        // int b = 20;
        // System.out.println(" print a = "+a+ " print b = "+b);

        // //swap the value method1
        // //  a = a+b;
        // //  b = a-b;
        // //  a = a-b;

        // //swap with temp method2
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("print a = "+a+ " print b = "+b);



        // Problem : calculate simple interest

        System.out.println("Enter the amount: ");
        int amout = sc.nextInt();

        System.out.println("Enter the rate: ");
        int rate = sc.nextInt();

        System.out.println("Enter the Time: ");
        int time = sc.nextInt();

        int ans = (amout*rate*time)/100;

        System.out.println("simple calculate rate is"+ans);
        

    }
    
}
