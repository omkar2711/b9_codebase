class Node{
    int data;
    Node next;

    Node (int value){
        this.data = value;
        this.next = null; 
    }
}


public class practise3 {
    Node head;
    void printLinkedList(){
       Node curr = head;
       if(curr == null){
        System.out.print("Linked list is empty");
        return;
       }
       while(curr != null){
        System.out.print(curr.data + "->");
        curr = curr.next;
       }
       System.out.println("null");

    }
    public static void main(String[] args) {
        practise3 list = new practise3();
        list.printLinkedList();
    }
    
}
