package DSA.Test3;
//Q21. Linked List Coding
//Write a function to insert a new node at the end of a singly linked list.

class Node{
    int data;
    Node next;
    Node(int data)
    {
         this.data = data;
         this.next = null;
    }
}
public class LinkedList {
    Node head;
    boolean isEmpty()
    {
        return head == null;
    }
    void insertAtStart(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head = newNode;
            System.out.println(data+" Added to the List");
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println(data +" Added to the List");
    }
    void insertAtPosition(int pos,int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head = newNode;
            System.out.println(data+" Added to the List");
            return;
        }
        Node curr = head;
        for(int i = 1;i<pos;i++)
        {
            curr = curr.next;
        }
        curr.next = newNode;
        System.out.println(data+" Added to the List");
    }
    void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head = newNode;
            System.out.println(data+" Added to the List");
            return;
        }
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = newNode;
        System.out.println(data+" Added to the List");
    }
    void removeElementAtStart()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty");
            return;
        }
        System.out.println(head.data+" Removed from the List");
        head = head.next;
    }
    void removeElementAtPosition(int pos)
    {
        Node curr=head;
        if(isEmpty())
        {
            System.out.println("List is Empty");
            return;
        }
        if(pos<0)
        {
            System.out.println("Invalid Position");
            return;
        }
        if(pos==0)
        {
            System.out.println("Element is Empty");
        }
        if(pos==1)
        {
            removeElementAtStart();
            return;
        }
        for(int i = 1;i<pos;i++)
        {
            curr = curr.next;
        }
        System.out.println(curr.data+" Removed from the List");
        curr.next = curr.next.next;
    }
    void removeElementAtEnd()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        while(curr.next.next != null)
        {
            curr = curr.next;
        }
        System.out.println(curr.data+" Removed from the List");
        curr.next = null;
    }
    void display()
    {
        if(isEmpty()) {
            System.out.println("Empty List");
            return;
        }
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data +"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
    LinkedList list = new LinkedList();
    list.insertAtStart(10);
    list.insertAtStart(20);
    list.insertAtEnd(20);
    list.insertAtEnd(25);
    list.insertAtPosition(3,25);
    list.insertAtEnd(205);
    list.insertAtEnd(250);
    list.insertAtEnd(125);
    list.display();
    list.removeElementAtStart();
    list.display();
    list.removeElementAtPosition(1);
    list.display();
    list.removeElementAtEnd();
    list.display();

    }
}
