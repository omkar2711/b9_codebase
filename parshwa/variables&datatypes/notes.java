
import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter amount=");
        int amount=input.nextInt();

        if(amount % 100==0){
            int count500=amount/500;
            amount=amount-count500*500;
            count500=amount/100;
            

        }
    }
}
