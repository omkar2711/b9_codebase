package conditionalstatement;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number to check even or odd : ");
        int num= sc.nextInt();

        if (num % 2 == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd ");
        }
sc.close();
    }
}
