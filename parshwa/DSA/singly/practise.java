class Node{
    int data;
    Node next;

    Node(int value){
        this.data=value;
        this.next=null;
    }
}

public class practise {

    Node head;
    void addNode(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }
        else{
            Node curr=head; 
            while(curr.next!= null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void printLinkedList(){
        Node curr = head;

        if(curr == null){
            System.out.println("Empty linked list");
            return;
        }

        while(curr != null){
            System.out.print(curr.data + "->");
            curr  = curr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        practise  list = new practise();
        list.addNode(10);
        list.printLinkedList();
    }
}
