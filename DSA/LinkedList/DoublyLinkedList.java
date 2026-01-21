package DSA.LinkedList;

class Node_d{
    int data;
    Node_d next;
    Node_d prev;

    Node_d(int val){
        this.data=val;
        this.next=null;
        this.prev=null;
    }
}




public class DoublyLinkedList {
    Node_d head;
    Node_d curr;
    void AddNode(int val){
   Node_d newNode=new Node_d(val);
   if(head == null){
    head=newNode;
     }
     else{
        while(curr.next != null){
            curr=curr.next;
        }curr.next = newNode;
        newNode.prev = curr;
     }
}
void PrintLinkedList()
    {
        Node_d curr=head;
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

public static void main(String[]args){

    DoublyLinkedList list=new DoublyLinkedList();

    list.AddNode(1);
    list.AddNode(3);

}
}
