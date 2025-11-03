package DSA.LinearDataStructure.LinkedList.singly;

class LinkdListOperation1
{
    Node head;
    void insertNodeAtFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node insert at First Successfully");
        return;
    }
    void insertNodeAtPosition(int position,int data)
    {
        Node newNode = new Node(data);
        Node curr = head;
        if(head==null)
        {
            insertNodeAtFirst(data);
            return;
        }
        for(int i = 1; i<position-1;i++)
        {
            if(curr.next == null)
            {
                System.out.println("Position Out of Bound");
            }
            curr=curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        System.out.println("Insert Succefully at "+position+" position");
        return;
    }

    void insertNodeAtLast(int data)
    {
        Node newNode = new Node(data);
        Node curr = head;
        if(head == null)
        {
            insertNodeAtFirst(data);
            return;
        }
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = newNode;
        System.out.println("Insert Node at Last Successfully");
        return;
    }

    void display()
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.print("null");
    }

    void deleteNodeAtFirst()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        head = head.next;
        return;
    }

    void deleteNodeAtPosition(int position)
    {
        Node curr = head;
        if(head == null)
        {
            System.out.println("Linked list is Empty");
            return;
        }
        if(position == 1)
        {
            deleteNodeAtFirst();
            return;
        }
        for(int i = 1;i<position-1;i++)
        {
            if(curr.next == null)
            {
                System.out.println("Position out of Bound");
                return;
            }
            curr=curr.next;
        }
        curr.next = curr.next.next;
        System.out.println("Node Deleted Successfully at "+position+" position");
        return;
    }

    void deleteNodeAtLast()
    {
        Node curr = head;
        if(head == null)
        {
            System.out.println("List is Empty , Nothing to Delete");
            return;
        }
        while(curr.next.next != null)
        {
            curr = curr.next;
        }
        curr.next = null;
        System.out.println("Node Deleted Successfully at End");
    }
}

public class SinglyLinkedlist1 {
    public static void main(String[] args) {
        LinkdListOperation1 list = new LinkdListOperation1();
        list.insertNodeAtLast(20);
        list.insertNodeAtFirst(10);
        list.insertNodeAtLast(30);
        list.insertNodeAtLast(40);
        list.insertNodeAtLast(50);
        list.insertNodeAtPosition(2,25);
        list.deleteNodeAtPosition(3);
        list.display();

    }
}

