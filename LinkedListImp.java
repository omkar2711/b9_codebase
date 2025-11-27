class Node {
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class LinkedListImp {

    Node head;

    void addAtStart(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void addAtPosition(int pos, int val){
        Node newNode = new Node(val);

        if(pos == 1){
            addAtStart(val);
            return;
        }

        Node curr = head;
        int count = 1;

        while(count < pos - 1 && curr != null){
            curr = curr.next;
            count++;
        }

        if(curr == null){
            System.out.println("Position is out of the range");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;


    }

    void printLinkedList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null ");
    }

    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();

        list.addAtStart(5);
        list.addAtStart(4);
        list.addAtStart(3);
        list.addAtEnd(6);
        list.addAtEnd(7);
        list.addAtPosition(3,10);
        list.addAtPosition(5,20);
        list.printLinkedList();

    }
}
