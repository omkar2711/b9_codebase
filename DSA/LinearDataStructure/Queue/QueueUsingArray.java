package DSA.LinearDataStructure.Queue;
class Queue{
    int capacity = 1001;
    int size = 0;
    int [] arr = new int[capacity];
    int front = 0;
    int rear = -1;
    public boolean isFull()
    {
        if(size == capacity-1)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty()
    {
        return size ==0;
    }
    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full,We Can't Add an Element");
            return;
        }
        rear = (rear+1)% capacity;
        arr[rear]=data;
        size++;
        System.out.println(data+" added to queue successfully");
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty,We Can't Remove an Element");
            return 0;
        }
        int x = arr[front];
        front++;
        size--;
        return x;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty,We Can't Get an Element");
            return 0;
        }
        return arr[front];
    }
}
public class QueueUsingArray {
    static void main(String[] args) {
       Queue q = new Queue();
       q.enqueue(5);
       q.enqueue(10);
       q.enqueue(60);
       q.enqueue(4);
//       System.out.println("Element at Peek is : "+q.peek());
        System.out.println("Element Dequeued is : "+q.dequeue());
        System.out.println("Element Dequeued is : "+q.dequeue());
        System.out.println("Element Dequeued is : "+q.dequeue());
        System.out.println("Element Dequeued is : "+q.dequeue());
        System.out.println("Element at Peek is : "+q.peek());
    }
}
