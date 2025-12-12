class Node {

    //Attributes
    int data;
    Node next;
    

    //Constructor
    Node(int value){
        this.data = value;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head;
    //Reverse a linked list
    //Find Cycle in a linked list

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

    //Print the linked list
    void printLinkedList(){
        Node curr = head;
        if(curr == null){
            System.out.println("Empty Linked list");
            return;
        }

        while(curr != null){
            System.out.print(curr.data + " -> ");  
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.printLinkedList();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.addAtStart(5);
        list.addAtStart(0);
        list.addAtPosition(9, 3);
        list.deleteAtStart();
        list.deleteAtEnd();
        list.deleteAtPosition(3);
        list.deleteAtPosition(3);
        list.printLinkedList();
        
    }
}
