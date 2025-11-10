package stack;


public class stackLinkedList {
    //implementation of stack ussing linked list
    class node{
        int data;
        node  next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head=null;
    void push(int data){
        node newnode=new node(data);
        if(isempty()){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    int pop(){
        if(isempty()){
            System.out.println("stack is empty.");
            return -1;
        }
        int x=head.data;
        head=head.next;
        return x;
    }

    int count=0;
    int size(){
        if(isempty()){
            System.out.println("stack is emoty");
            return -1;
        }
        node curr= head;
        while(curr.next != null){
            count++;
        }
        return count;
    }

    int peek(){
          if(isempty()){
            System.out.println("stack is emoty");
            return -1;
        }
        return head.data;
    }
    
    boolean isempty(){
        if(head==null){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        stackLinkedList s=new stackLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("popped element : "+ s.pop());
        System.out.println("top element : "+ s.peek());

    }
    
}
