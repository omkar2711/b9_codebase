package javaBasics.controlFlowConditionalStatments;
import java.util.*;

public class problem3 {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number-->");
        int N=Sc.nextInt();


        if(N % 2 == 0)
        {

            System.out.println("The given number "+N+" is even");

        }else{System.out.println("The given number "+N+" is Odd");}

    }
    
}
