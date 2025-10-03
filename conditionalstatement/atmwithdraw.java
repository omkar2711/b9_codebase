package conditionalstatement;
import java.util.Scanner;
public class atmwithdraw {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the amount :");
    int amount=sc.nextInt();

    if(amount%100==0){
        int count500= amount/500;
        int remainingamount=amount- (count500*500);
        int count100= remainingamount/100;

        System.out.println("500 notes : "+count500);
        System.out.println("100 notes :"+count100);
        System.out.println("amount: "+amount);
    }else{
        System.out.println("number is not acceptable");
    }
    sc.close();
}
}

