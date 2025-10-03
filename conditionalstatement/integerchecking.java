package conditionalstatement;
import java.util.Scanner;
public class integerchecking {
    public static void main(String[] args) {
        
        // check the given number is positive, negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if (num > 0){
            System.out.println("positive number");
        }else if(num<0){
            System.out.println("number is negative");
        }else{
            System.out.println("number is zero");
        }
sc.close();
    }
}
