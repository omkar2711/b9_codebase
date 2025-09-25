
import java.util.Scanner;

public class leepyear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter year=");
        int year=input.nextInt();
        
        if(year % 4==0 && year%100==0){
            System.out.println("Leep year");
        }

    }
}
