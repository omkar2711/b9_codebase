package DSA.Strings.classString;

import java.util.Scanner;
import java.util.Stack;

public class RevAStringUsingStack {
    static void main(String[] args) {
        Stack<Character> s1=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String Name = sc.next();
        for(int i=0;i<Name.length();i++){
            s1.push(Name.charAt(i));
        }
        System.out.println("Reversed String is");
        for(int i=0;i<Name.length();i++){
            System.out.print(s1.pop());
        }
    }
}
