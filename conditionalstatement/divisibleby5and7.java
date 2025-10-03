package conditionalstatement;
import java.util.Scanner;
public class divisibleby5and7 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();

        if((num%5==0 && num %7==0)){
            System.out.println("number is divisible by both 5 an 7 ");
        }
        else{
            System.out.println("this number is not divisible by 5 and 7");
        }
        sc.close();
    }
}
