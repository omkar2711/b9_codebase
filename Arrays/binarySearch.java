package Arrays;

import java.util.Scanner;

public class binarySearch {
    public static int sorting(int[] number , int key){
        int start=0;
        int end=number.length;
        
        while(start <=end){
            int mid=(start+end)/2;

            if(number[mid]==key){
                return mid;
            }else if(number[mid] < key){
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key =10;
        int[] number= new int[6];
        for(int i=0;i<6;i++){
            System.out.println("enter the element "+i+":");
            number[i]=sc.nextInt();
        }
        System.out.println("index for key is "+ sorting(number, key));
        sc.close();
    }
    
}
