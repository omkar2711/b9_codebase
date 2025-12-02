package DSA.Test3;
//Q20. Stack Problem
//Implement a stack using an array with the following operations:
//•	push()
//•	pop()
//•	peek()
//•	isEmpty()

public class Stack {
    int capacity = 1001;
    int[] arr = new int[capacity];
    int top =-1;

    void push(int data)
    {
        if(isFull())
        {
            System.out.println("Overflow");
            return ;
        }
        top++;
        arr[top]=data;
        System.out.println(data+ " Added to the Stack");
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
            return 0;
        }
        int a = arr[top];
        top--;
        return a;
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        return arr[top];
    }
    boolean isFull()
    {
        return top==capacity-1;
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    void display()
    {
        System.out.println("Linked List Element ");
        for(int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.display();
        System.out.println();
        System.out.println("Poped ELement is "+s1.pop());
        s1.display();
        System.out.println("\nElement at Peek is "+s1.peek());
        s1.display();
    }

}
