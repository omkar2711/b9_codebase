package DSA.LinearDataStructure.Arrays;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int n=scanner.nextInt();
        String[] input=new String[n];
        System.out.println("Enter the strings:");
        for (int i=0;i< input.length;i++)
        {
            input[i]=scanner.nextLine();
        }
        System.out.println("Concatinates Strings : "+StringConcatination(input));
    }
    public static String StringConcatination(String[] input)
    {
        String s= "";
        for(int i=0;i<input.length;i++)
        {
        s= s + input[i];
        }
        return s;
    }
}
