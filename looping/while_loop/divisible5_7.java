package while_loop;
import java.util.Scanner;
public class divisible5_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value : ");
        int n=sc.nextInt();

        int i =0;
        while (i<=n) {
            if((i%5==0 && i%7==0)){
                System.out.println(i);
            }
            i++;
        }
         sc.close();
    }
    
}
