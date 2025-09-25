import java.util.Scanner;

public class Environment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if(temp <=0){
            System.out.println("Freeze");
        }else if (temp > 0 && temp <=18){
            System.out.println("Cold");

        } else if (temp > 18 && temp <=30) {
            System.out.println("Mid");

        }else {
            System.out.println("Hot");
        }
    }
}
