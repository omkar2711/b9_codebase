//Implement Stack using LinkedList


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    Node head;
    Node top;
   

    void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            System.out.println(data + " data added");
            return;
        }
        newNode.next = top;
        top = newNode;
        System.out.println(data + " data added");
    }

    int pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        Node temp = top;
        top = top.next;
        return temp.data;
    }

    int peek(){
        if(top == null){
            System.out.println("Stack UnderFlow");
            return 0;
        }
        return top.data;
    }
    boolean isEmpty(){
        return top == null;
    }


}

public class stackImplementation2{
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.pop());
        System.out.println(s1.peek());
    }
}