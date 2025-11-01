class Node{
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }
}

public class practise5 {

    Node head;

    void addNode(int val){
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

    void printLinkedList(){
        Node curr = head;
        if(curr == null){
            System.out.print("Linked  list is empty");
            return;
        }
        while(curr != null){
            System.out.println(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        practise5 list = new practise5();
        list.addNode(10);
        list.addNode(20);
        list.printLinkedList();
    }
    
}
