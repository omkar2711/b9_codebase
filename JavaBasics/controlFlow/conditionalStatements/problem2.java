package JavaBasics.controlFlow.conditionalStatements;


import java.util.Scanner;

//
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        int temperature = input.nextInt();

        if(temperature < 0) {
            System.out.println("Freeze ");
        }
        else if(temperature >= 0 && temperature < 18){
            System.out.println("Cold ");
        }
        else if(temperature >= 18 && temperature < 30){
            System.out.println("Mid ");
        }
        else{
            System.out.println("Hot ");
        }
    }
}
