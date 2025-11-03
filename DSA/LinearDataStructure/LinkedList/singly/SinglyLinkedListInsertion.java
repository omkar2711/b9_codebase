package DSA.LinearDataStructure.LinkedList.singly;

public class SinglyLinkedListInsertion {
     Node head;
     void InsertAtFirst(int data) {
         Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;
     }

    void InsertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null)
        {
            curr=curr.next;
        }
         curr.next=newNode;
    }
    void insertAtPosition(int data, int position)
    {
        Node newNode = new Node(data);
        Node curr = head;
        if(head == null)
        {
            System.out.println("Empty List");
            return;
        }
        if(position==1)
        {
            newNode.next=head.next;
            head=newNode;
        }
        for(int i=1 ; i <position-1;i++)
        {
            if(curr == null)
            {
                System.out.println("Position out of Bound");
                return;
            }
            curr=curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }
    void display()
    {
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
   public static void main(String[] args) {
        SinglyLinkedListInsertion s1 = new SinglyLinkedListInsertion();
        s1.InsertAtEnd(10);
        s1.InsertAtEnd(20);
        s1.InsertAtEnd(30);
        s1.InsertAtFirst(20);
        s1.insertAtPosition(300,3);
        s1.InsertAtFirst(1005);
        s1.display();
     //  System.out.println(s1.toString());
    }
}
