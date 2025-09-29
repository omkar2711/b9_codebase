package JavaBasics.controlFlow.loops;

import java.util.Scanner;

public class printNnaturalNumbers {
    public static void main(String[] args) {


//        int n = 10;

//      Scanner in = new Scanner(System.in);
//      int n = in.nextInt();
//      for(int i = 1; i <= n ;i++){
//          System.out.println(n - i + 1);
//      }
//      in.close();


      //Reverse for loop
//        for(int i = 10 ; i >= 1 ;i--){
//            System.out.println(i);
//        }

        int n = 10;
        int i = 1;

        do{
            System.out.println(i);
            i++;
        }while(i<0);

    }
}
