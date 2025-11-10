package stack;

import java.util.Scanner;

public class stackquestion1 {
    // Declare a stack to store Integer values. Add elements from 0 to 10 to the stack. After adding print out the values only if they are odd integers and pop that value

    int size;
    int arr[];
    int top =-1;

    stackquestion1(int size){
        this.size=size;
        arr=new int[size];
    }

      int pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return -1;
        }
        return arr[top--];
    }

    void push(int val){
        if(top == size -1){
            System.out.println("stack overflow...");
            return;
        }
        top++;
        arr[top]=val;
    }


    boolean isempty(){
        if(top == -1){
            return true;
        }
        return false;
    }
     boolean isEmpty() {
        return top == -1;
    }

    void popOddInt() {
        System.out.println("Popped odd integers:");
        while (!isEmpty()) {
            int val = pop();     // remove top element
            if (val % 2 != 0) {  // check odd
                System.out.println(val);
            }
        }
    }

    void oddinteger(){
        System.out.println("odd integers: ");
        for(int i =0 ;i<arr.length;i++){
            if(arr[i] %2 != 0){
                System.out.println(arr[i]);
            }
        }
    }

    boolean isfull(){
        if(top == size-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
    stackquestion1 s=new stackquestion1(11);
    Scanner sc=new Scanner(System.in);

    while(!s.isfull()){
        System.out.print("enter values: ");
        int val =sc.nextInt();
        s.push(val);
    }
    System.out.println("-------------------------------------------");
    s.popOddInt();

    System.out.println();

    s.oddinteger();
    sc.close();


    }
    
}
