package conditionalstatement;
import java.util.Scanner;
public class tempcondition{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the temperature : ");
    int temp=sc.nextInt();

    if(temp>30){
        System.out.println("Hot");

    }else if(temp<30 && temp>=18){
        System.out.println("normal temperature");
    }else if(temp <18 && temp>0){
        System.out.println("cold");
    }else if(temp <0){
        System.out.println("very cold freezing temperature");
    }
     sc.close();
}
}