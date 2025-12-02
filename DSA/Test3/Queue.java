package DSA.Test3;
import java.util.Stack;
//Q22. Queue Coding
//Implement a queue using two stacks. The queue should support:
//•	enqueue()
//•	dequeue()
//•	peek()
//•	isEmpty()

public class Queue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    Queue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    public void enqueue(int x){
        s1.push(x);
        System.out.println("Enqueued "+x);
        return;
    }
    public int dequeue(){
        while(!(s1.isEmpty()))
        {
            s2.push(s1.pop());
        }
        return s2.pop();
    }
    public int peek(){
        while (!(s1.isEmpty()))
        {
            s2.push(s1.pop());
        }
        return s2.peek();
    }
    void display(){
        while(s1.isEmpty())
        {
            s2.push(s1.pop());
        }
    }
    public static   void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.dequeue());
        System.out.println(q.s2);
        System.out.println(q.peek());

    }
}
