package DSA.LinearDataStructure.LinkedList.singly;
class Node1{
    String data;
    Node1 next;
    Node1(String data){
        this.data=data;
        this.next=null;
    }
}
public class StringList {
    Node1 head;
    void insertAtStart(String data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
            System.out.println(data +"is Added to the List");
            return;
        }
        newNode.next=head;
        head=newNode;
        System.out.println(data +"is Added to the List");
    }
    void insertAtEnd(String data){
        Node1 newNode=new Node1(data);
        if(head==null){
            insertAtStart(data);
            return;
        }
        Node1 curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        System.out.println(data +"is Added to the List");
    }
    void display(){
        Node1 curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    static void main(String[] args) {
        StringList list=new StringList();
        list.insertAtEnd("Aditya");
        list.insertAtStart("Chaudhari");
        list.insertAtEnd("Bapusaheb");
        list.display();
    }
}
