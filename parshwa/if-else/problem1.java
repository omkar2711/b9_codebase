// take tempreture as input and check the tempreture is Freeze cold or hot
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter tempreture =");
        int tempreture = sc.nextInt();

        if(tempreture<0){
            System.out.println("Freeze tempreture");
        }

        else if(tempreture >=0 && tempreture <18){
            System.out.println("cold");
        }

        else if(tempreture >=18 && tempreture <30){
            System.out.println("Mid");
        }

        else{
            System.out.println("Tempreture is hot");
        }

        sc.close();

    }
}
