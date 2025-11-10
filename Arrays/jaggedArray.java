package Arrays;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        // jagged array means fixed row size but column size is different
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int[][] arr=new int[row][];
        for(int i=0;i<arr.length;i++){
            int cols=sc.nextInt();
            arr[i]=new int[cols];
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("enter the element ["+i+"] ["+j+"]: ");
                arr[i][j]=sc.nextInt();
                count++;
            }
        }

        System.out.println("total size of the array: "+count);
        sc.close();

    }
    
}
