class Node{
    //attributes
    int data;
    Node next;

    //constructor
    Node(int value){
        this.data=value;
        this.next=null;
    }
}

public class pr {

    Node head;

    // add node at the end of the list
    void addAtEnd(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            Node curr =head;
            while(curr.next !=null){
                curr=curr.next;
            }
            curr.next=newnode;
        }
    }

    // add node at start of the list
    void addAtStart(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }

    //add at position
    void addAtPosition(int val,int poss){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
        }
        else if(poss==1){
            addAtStart(val);
        }
        else{
            Node curr = head;
            for(int i=1;i<poss-1;i++){
                curr=curr.next;
            }
            if(curr!=null){
                System.out.println("Invalid position");
                return;
            }
            newNode.next = curr.next;
            curr.next=newNode;
        }

    }

    // print the linked list
    void printLinkedList(){
        Node curr = head;
        if(curr==null){
            System.out.println("Empty list");
        }
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
       pr list=new pr();
         list.addAtEnd(10);
         list.addAtStart(5);
         list.addAtPosition(7, 2);
         list.printLinkedList();
    }
}
