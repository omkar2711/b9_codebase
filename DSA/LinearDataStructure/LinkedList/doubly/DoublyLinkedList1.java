package DSA.LinearDataStructure.LinkedList.doubly;

class LinkedListOperations{
    static Node head;
    void insertNodeAtFirst(int data){

    }
    void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
public class DoublyLinkedList1 {
    public static void main(String[] args)
    {
        LinkedListOperations list = new LinkedListOperations();
        list.insertNodeAtFirst(10);
        list.insertNodeAtFirst(20);
        list.insertNodeAtFirst(30);
        list.display();
    }

}
