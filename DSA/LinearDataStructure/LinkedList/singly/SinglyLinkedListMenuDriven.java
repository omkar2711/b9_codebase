package DSA.LinearDataStructure.LinkedList.singly;

import java.util.Scanner;

class LinkedListOperations {
    Node head;
    void insertNodeAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node Inserted Successfully at First");
    }
    void deleteNodeAtStart() {
            if (head != null) {
                head = head.next;
                System.out.println("Node Deleted Successfully at First");
            } else {
                System.out.println("List is already empty");
            }
    }
    void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            insertNodeAtStart(data);
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            System.out.println("Node Inserted Successfully at Last");
        }
    }
    void deleteNodeAtEnd() {
        Node curr = head;
        while(curr.next.next != null)
        {
            curr = curr.next;
        }
        curr.next = null;
    }

    void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else if (position == 1) {
            insertNodeAtStart(data);
            return;
        } else {
            Node curr = head;
            for(int i = 1;i<position-1;i++)
            {
                curr = curr.next;
            }
            newNode.next=curr.next;
            curr.next=newNode;
            System.out.println("Node Inserted Successfully at "+position+" Position");
        }
    }
    void deleteAtPosition(int position) {
        Node curr = head;
        for(int i = 1;i<position-1;i++)
        {
            curr=curr.next;
        }
        curr.next = curr.next.next;
        System.out.println("Node Deleted Successfully at "+position+" Position");
    }
    void displayLinkedList()
    {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
public class SinglyLinkedListMenuDriven {

    public static void main(String[] args) {
        LinkedListOperations s1 = new LinkedListOperations();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select your choice:");
            System.out.println("1.Insert Node At Start\n2.Insert Node At End\n3.Insert At Position\n4.Delete Node at First Position\n5.Delete Node at Last Position\n6.Delete Node at Given Postion\n7.Display Linked List");
            int choice = sc.nextInt();
            int data;
        switch (choice)
        {
            case 1:
                System.out.print("Enter the Data You want to Insert : ");
                 data = sc.nextInt();
                s1.insertNodeAtStart(data);
                break;
            case 2:
                System.out.print("Enter the Data You want to Insert : ");
                data = sc.nextInt();
                s1.insertNodeAtEnd(data);
                break;
            case 3:
                System.out.print("Enter the Position where you want to Insert the Node : ");
                int pos  = sc.nextInt();
                System.out.print("\nEnter the Data You want to Insert : ");
                data = sc.nextInt();
                s1.insertAtPosition(pos,data);
                break;
            case 4:s1.deleteNodeAtStart();
            break;
            case 5:s1.deleteNodeAtEnd();
            break;
            case 6: System.out.println("Enter the Position of node which you want to delete ");
                    int position = sc.nextInt();
                    s1.deleteAtPosition(position);
                    break;
            case 7:s1.displayLinkedList();
                    break;
            default:
                System.out.println("Invalid Choice");
        }
        }
    }
}
