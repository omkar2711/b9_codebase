package javaBasics;

import java.util.Scanner;

public class welcome {
    public static void main(String args[]){
        Scanner SC=new Scanner(System.in);

        System.out.println("Enter your name and hobby :-->");
        String name=SC.nextLine();
        String hobby=SC.nextLine();

        System.out.println("Hii My name is "+name+" and my hobby is "+hobby);
        
    }
    
}
