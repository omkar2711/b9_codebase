package DSA.LinearDataStructure.Arrays;
import java.util.Arrays;
import java.util.Stack;
import java.util.Scanner;
public class RevAArrayUsingStack {
    static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            s1.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Reversed Array is");
        for(int i=0;i<n;i++){
            arr[i]=s1.pop();
        }
        System.out.println(Arrays.toString(arr));
    }

}
