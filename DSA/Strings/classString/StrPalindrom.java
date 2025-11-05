package DSA.Strings.classString;

import java.util.Locale;
import java.util.Scanner;

public class StrPalindrom {
    void Palindrom(String str)
    {
        String rev ="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println(str+" is Palindrom");
        }
        else{
            System.out.println(str+" is Not Palindrom");
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= new String();
        System.out.print("Enter a string : ");
        str=sc.nextLine();
        String str1 = str.toLowerCase();
        StrPalindrom sp=new StrPalindrom();
        sp.Palindrom(str1);
        sc.close();
    }
}
