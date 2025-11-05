package DSA.LinearDataStructure.Stack;

import java.util.Scanner;

public class StackArray {
        int n = 50;
        int[] arr = new int[n];
        int top =-1;


        public void push(int data)
        {
            if(top == n-1)
            {
                System.out.println("Stack Overflow");
                return;
            }
            top++;
            arr[top]=data;
            System.out.println(data + " added to Stack");
        }

        public int pop()
        {
            if(top == -1)
            {
                System.out.println("Stack Underflow");
                return 0;
            }
            int a = arr[top];
            top--;
            return a;
        }
        public int peek()
        {
            if(top == -1)
            {
                System.out.println("Stack is Empty");
                return 0;
            }
            return arr[top];
        }
        public boolean isEmpty()
        {
            return top == -1;
        }
        public boolean isFull()
        {
            return top == n-1;
        }
        public static void main(String[] args)
        {
            StackArray s1 = new StackArray();
            s1.push(1);
            s1.push(2);
            s1.push(3);
            s1.push(4);
            System.out.println("Element that Pop is "+s1.pop());
            System.out.println("Element at peek is "+s1.peek());
        }

}
