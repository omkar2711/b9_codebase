package DSA.Arrays;


import java.util.Scanner;

public class array1 {

    /*public static int findSum(int n, int []arr)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        return sum;

    }

    public static int findProduct(int n, int[] arr){
        int product = 1;
        for(int i=0;i<n;i++)
        {
            product = product * arr[i];
        }
        return product;
    }

    public static int findAvg(int n, int []arr)
    {
        int sum=findSum(n,arr);
        int avg=sum/n;
        return avg;

    }*/

    public static String concatString(int n,String []arr)
    {
        String str="";
        for(int i=0;i<n;i++)
        {
            str=str+arr[i];
        }
        return str;
    }
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter how many array elements you want");
        int n=SC.nextInt();
        String [] arr=new String[n];


        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of the array at "+(i+1)+":");
            arr[i]=SC.next();
        }


       // System.out.println("the Sum of all array elements is:-->"+findSum(n,arr));
        //System.out.println("the product of all array elements :-->"+findProduct(n,arr));
       // System.out.println("the avg of all elements-->"+findAvg(n, arr));
        //System.out.println("the avg of all elements-->"+findSum(n,arr)/n);
        System.out.println("Concat all String from array-->"+concatString(n, arr));


    }


}
