import java.util.Scanner;

public class atmMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        if(amount % 100 == 0){
            int count500 = amount / 500;
            int count100 = amount % 500;
            count100 = count100 / 100;


            System.out.println("500 :"+count500);
            System.out.println("100: "+count100);
        }else {
            System.out.println("Entered amount is not divisible by 100");
        }
    }
}
