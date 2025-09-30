
import java.util.Scanner;

public class naturalnouser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no=");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        in.close();
    }
    
}
