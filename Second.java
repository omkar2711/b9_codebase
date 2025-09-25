import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number * i);
        }
       double square = Math.pow(number,2); // return always double value
        System.out.println(square);
    }
}


