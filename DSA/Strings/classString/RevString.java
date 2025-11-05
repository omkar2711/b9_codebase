package DSA.Strings.classString;

import java.util.Scanner;

public class RevString {
    void strRev(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev += str.charAt(i);
        }
        System.out.print(rev);
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the string : ");
        str=sc.nextLine();
        RevString r=new RevString();
        System.out.println(str);
        r.strRev(str);
    }
}
