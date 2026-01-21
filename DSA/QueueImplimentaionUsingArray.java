package DSA;

class Queue{

    int capacity;
    int size;
    int[] arr=new int[capacity];
    int front=0, rear=-1;

    boolean isFull()
    {
            return size==capacity;
    }
    void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("can not add element because Queue is full");
            return;
        }
        rear =(rear+1)%capacity;
        arr[rear]=data;
        size++;
        System.out.println(data+"element added");
    }
    boolean isEmpty()
    {
        return size==0;
    }
    int deQueue(){

        if(isEmpty())
        {
            System.out.println("can not remove element because queue is empty");
            return 0;
        }
        int x = arr[front];
        front++;
        size--;
        return x;
    }
     int peek(){
        return arr[front];
    }

}

public class QueueImplimentaionUsingArray {
    public static void main(String[] args){

    }
    
}
