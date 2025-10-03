package while_loop;
import java.util.Scanner;
public class allodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n =sc.nextInt();

        int i=1;
        while (i<=n) {
            System.out.println(i);
            i=i+2;
        }
         sc.close();
    }
}
