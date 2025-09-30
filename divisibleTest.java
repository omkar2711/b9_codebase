import java.util.Scanner;

public class divisibleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if( num % 5 == 0 && num % 7 == 0){
            System.out.println("The number is divisible 5 and 7");
        }else {
            System.out.println("The number is not divisible 5 and 7");
        }
    }
}
