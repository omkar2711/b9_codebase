package DSA;




class listNode{
     int data;
     listNode next;
     listNode(int val){
         this.data=val;
         this.next=null;
     }
 }


public class queueImplimentationUsingLinkedList {

    listNode head;
    void enqueue(int val){

        listNode newNode = new listNode(val);
        if(head == null){
            head = newNode;
        }
        else{
            listNode curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void dequeue(){
        if(head == null){
            System.out.println("Queue is empty");
        }else {
            head = head.next;
        }
    }
    void PrintqueueList()
    {
        listNode curr=head;
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
    public static void main(String[] args)
    {
        queueImplimentationUsingLinkedList q = new queueImplimentationUsingLinkedList();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.dequeue();

        q.PrintqueueList();
    }
}
