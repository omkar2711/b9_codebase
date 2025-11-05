package DSA.LinearDataStructure.Stack;

public class StackLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head;
        public static boolean isEmpty()
        {
            if(head == null){
                return true;
            }
            return false;
        }
        public static void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static void pop()
        {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            head = head.next;
        }
        public static void displayStack()
        {
            if(Stack.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            Node curr = Stack.head;
            while(curr != null){
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
            System.out.println("null");
        }
        public static void peek()
        {
            if(Stack.isEmpty()){
                System.out.println("top -> -1");
                return;
            }
            System.out.println("top->"+head.data);
        }
    }


   public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        Stack.displayStack();
       Stack.peek();
        Stack.pop();

        Stack.displayStack();
       Stack.peek();
        Stack.pop();

        Stack.displayStack();
       Stack.peek();
       Stack.pop();

        Stack.displayStack();
        Stack.peek();

    }
}
