package Arrays;

import java.util.Scanner;

public class subarrayLogic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,4,6,8,10};

        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print(arr[j]+", ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
