
class Node{
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }
}
public class practise7 {
    Node head; //  reference for first node 

    void addNode(int val){  
        Node newNode = new Node(val);  //  we create a node here 
        if(head == null){  
            head = newNode; // in this condition we check if the new node is not exist then make newnode headnnode
        }
        else{
            Node curr = head;  // in this we create curr for traversing betwwn nodes and assign it to first node  
            while(curr.next != null){  // in this  we check curr.next is not = to null
                curr = curr.next; // then we move curr to next
            }
            curr.next = newNode; //when we reach null then we will add new node 
        }
    }

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
        practise7 list = new practise7();
        list.addNode(10);
        list.addNode(20);
        list.printLinkedList();
    }
}
