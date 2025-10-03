package conditionalstatement;
import java.util.Scanner;
public class voteeligibility {
    public static void main(String[] args) {
//write a program to check vote eligibility

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age of the person: ");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("this person is eligible for vote. ");
        }else{
            System.out.println("this person is not eligible for vote");
        }
         sc.close();
    }
}
