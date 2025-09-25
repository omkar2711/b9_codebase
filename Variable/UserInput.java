import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();

        // System.out.print("Enter your favorite hobby: ");
        // String hobby = sc.nextLine();

        // System.out.println("Hello " + name + "! Your favorite hobby is " + hobby + ".");

        //sc.close(); // close scanner
        // swap two Variable

        var x = 5;
        var y = 10;
        System.out.println("Varibale x  = " + x + " y value is " + y);
        // now swap
        x = y + x; // 15 
        y = x - y; // 15 -10 now y = 5
        x = x - y; // 15 - 5 now x = 10
        System.out.println( "now value swap is " + x + " now y = " + y);


        // calculate simple intrest
        System.out.print("Enter Amount: ");
         int amount = sc.nextInt();

        System.out.print("Enter Rate: ");
            int rate = sc.nextInt();
        System.out.print("Enter Time: ");
         int time = sc.nextInt();
         
         int SI = (amount * rate * time )/ 100;
         System.out.println( "Interset Amout is " + SI);



    }
}
