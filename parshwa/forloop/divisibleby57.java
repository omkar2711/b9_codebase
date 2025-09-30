package parshwa.forloop;
import java.util.Scanner;

public class divisibleby57 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter no=");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            if(i%5==0 &i%7==0){
                System.out.println(i);
            }
        }
        s.close();
    }
    
}
