package DSA.Arrays.control_flow_statements;
import java.util.Scanner;
public class AmountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount in 100");
        int amt =  sc.nextInt();

        int NotesOf500 = amt/500;
        int Remaining_amt = amt % 500;
        int NotesOf100 = Remaining_amt/100;

        System.out.println("500  notes is "+NotesOf500);
        System.out.println("100  notes is "+NotesOf100);
        sc.close();
    }
}
