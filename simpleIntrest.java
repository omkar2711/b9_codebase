import java.util.Scanner;

public class simpleIntrest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        int principleAmount = sc.nextInt();
        System.out.println("Enter rate of interest");
        int rateInterest = sc.nextInt();
        System.out.println("Enter time of period");
        int timePeriod = sc.nextInt();

        int simpleInterest = ( principleAmount * rateInterest * timePeriod ) /100;
        System.out.println(simpleInterest);
    }
}
