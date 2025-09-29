package DSA.Arrays.control_flow_statements.if_else;
import java.util.Scanner;
public class AmountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount in 100");
        int amt =  sc.nextInt();

        int NotesOf500 = amt/500;
        int Remaining_amt = amt % 500;
        int NotesOf100 = Remaining_amt/100;
        int NotesOf10 = Remaining_amt/10;
        int CoinsOf5 = Remaining_amt/5;
        int CoinsOf2 = Remaining_amt/2;;


        System.out.println("Coins  of 2 Rs is "+CoinsOf2);
        System.out.println("Coins of 5 Rs "+CoinsOf5);
        System.out.println("notes of 10 Rs is "+NotesOf10);
        System.out.println("notes of 100 Rs is "+NotesOf100);
        System.out.println("notes of 500 Rs is "+NotesOf500);
        sc.close();
    }
}
