package DSA.Stack;

class Node{
    int data;
    Node next;

    Node (int value) {
        this.data = value;
        this.next = null;
    }
}

class Stack1{
    Node top;

    void push(int value){
        Node newNode = new Node(value);
        if(top == null){
            top = newNode;
            System.out.println(value+" element is added to the stack");
            return;
        }else {
            newNode.next = top;
            top = newNode;
            System.out.println(value+" element is added to the stack");
        }
    }

    int pop(){
        if(top == null){
            System.out.println("stack is empty");
            return 0;
        }
        Node curr = top;
        top = top.next;

        return curr.data;
    }

    int peek(){
        if(top == null){
            System.out.println("stack is empty");
            return 0;
        }
        return top.data;
    }
}

public class implementationUsingLinkedlList {
    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(5);
        System.out.println("top is "+st.peek());
        st.push(10);
        System.out.println("top is "+st.peek());
        st.push(15);
        System.out.println("top is "+st.peek());
        System.out.println("element is popped from stack "+st.pop());
        System.out.println("top is "+st.peek());


    }
}
