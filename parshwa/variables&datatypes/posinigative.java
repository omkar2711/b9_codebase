
import java.util.Scanner;

public class posinigative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a no=");
        int no=sc.nextInt();

        if(no<0){
            System.out.println("The no is negative");
        }
        
        else if(no==0){
            System.out.println("The no is zero");
        }

        else{
            System.out.println("The no is possitive");
        }

        sc.close();
    }
}
