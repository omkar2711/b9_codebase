package DSA.LinearDataStructure.Queue;

import java.sql.SQLOutput;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next=null;
    }
}
class Queue1 {
    Node front=null;
    Node rear=null;
    public void enqueue(int data)
    {
        Node newNode = new Node(data);
        if(rear == null)
        {
            front = rear = newNode;
            System.out.println(data+" Added to the Queue");
            return;
        }
        rear.next = newNode;
        rear = rear.next;
        System.out.println(data+" Added to the Queue");
    }
    public boolean isEmpty()
    {
        return (front == null);
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0;
        }
        int data = front.data;
        front = front.next;
        return data;
    }
    public int peek()
    {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0;
        }
        return front.data;
    }

    void display()
    {
        Node curr = front;
        while(curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

}
public class QueueLinkedList {
    static void main(String[] args) {
        Queue1 q1 = new Queue1();
        q1.enqueue(10);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.display();
        System.out.println("Elemet at Peek is : "+q1.peek());
        System.out.println("Dequeued Elemet is : "+q1.dequeue());
        System.out.println("Elemet at Peek is : "+q1.peek());
        q1.display();
        System.out.println("Dequeued Elemet is : "+q1.dequeue());
        q1.display();
        System.out.println("Elemet at Peek is : "+q1.peek());
        System.out.println("Dequeued Elemet is : "+q1.dequeue());
        System.out.println("Dequeued Elemet is : "+q1.dequeue());
    }
}
