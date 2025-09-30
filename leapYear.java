import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();


        //year is divisible by 4
        //year is divisible by 100  && 400
        if(year % 4 == 0 && year % 100 == 0 && year % 400 ==0 ){
            System.out.println("Leap year");
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 !=0 ){
            System.out.println("Not leap year");
        }
        else {
            System.out.println("Leap year");
        }

    }
}
