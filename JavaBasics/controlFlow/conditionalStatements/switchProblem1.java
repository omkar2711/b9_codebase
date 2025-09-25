package JavaBasics.controlFlow.conditionalStatements;

import java.util.Scanner;


//
public class switchProblem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day = input.nextLine();

        switch (day) {
            case "Monday":
                System.out.println(0);

            default:
                System.out.println("Invalid day");
        }

    }
}
