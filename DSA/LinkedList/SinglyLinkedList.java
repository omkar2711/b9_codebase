package DSA.LinkedList;

class Node{
    int data;
    Node next;

    Node(int val){
        this.data=val;
        this.next=null;
    }
}

public class SinglyLinkedList {

    Node head;

    void addNode(int val){
        Node newNode=new Node(val);
        if(head == null){
            head=newNode;
        }
        else{
            Node curr=head;
            while(curr.next != null)
            {
                curr=curr.next;

            } curr.next=newNode;

        }

    }

    //Add a node at the end of the list
    void addAtEnd(int val){

        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    //Add the node at the start of the list
    void addAtStart(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    void addAtPosition(int val, int pos){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }
        else if(pos == 1){
            addAtStart(val);
        }
        else{
            Node curr = head;
            for(int i = 1;i<pos-1;i++){ //pos = 3. > 2. > 1
                curr = curr.next;
            }
            if(curr == null){
                System.out.println("Invalid position");
                return;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }

    }


    //Delete at Start
    void deleteAtStart(){
        if(head == null){
            System.out.println("Empty Linked list Cannot delete");
            return;
        }
        head = head.next;
    }

    //Delete At End
    void deleteAtEnd(){
        if(head == null){
            System.out.println("Empty Linked list Cannot delete");
            return;
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }

    //Delete At position
    void deleteAtPosition(int pos){
        if(head == null){
            System.out.println("Empty Linked list Cannot delete");
            return;
        }
        Node curr = head;
        for(int i = 1;i<pos-1;i++){
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("Invalid position cannot delete node");
            return;
        }
        curr.next = curr.next.next;
    }

    void PrintLinkedList()
    {
        Node curr=head;
        if(curr == null)
        {
            System.out.println("Empty list");
            return;
        }else
        {
            while(curr !=null)
            {
                System.out.print(curr.data+"->");
                curr=curr.next;

            }System.out.print("null");
        }

    }
    public static void main(String[] args){
        SinglyLinkedList list=new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addAtStart(0);
        list.addAtPosition(4,5);
        list.addAtEnd(5);
        list.deleteAtStart();
        list.deleteAtPosition(3);
        list.deleteAtEnd();
        list.addNode(7);


        list.PrintLinkedList();


    }
}
