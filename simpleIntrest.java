import java.util.*;
public class simpleIntrest {
    public static void main(String[] args) {
     
        Scanner SC=new Scanner(System.in);

        System.out.println("Enter the values of principel amount ");
        int pa=SC.nextInt();
        System.out.println("Enter the value of rate of intrest:-->");
        int ri=SC.nextInt();
        System.out.println("Enter the value of time period:-->");
        int tp=SC.nextInt();

        int Si=(pa*ri*tp)/100;

        System.out.println("The value of simple intrest is:-->"+Si);

    }

}
