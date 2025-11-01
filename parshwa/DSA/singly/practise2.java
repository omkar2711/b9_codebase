class Node{
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }
}

public class practise2 {

    Node head;
    void printLinkedList(){
        Node curr = head;

        if(curr==null){
            System.out.println("Empty linked list");
            return;
        }

        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        practise2 list = new practise2();
        list.printLinkedList();
    }
}
