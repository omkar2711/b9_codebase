class Queue{
    int capacity = 1001;
    int size = 0;
    int[] arr = new int[capacity];
    int front = 0, rear = -1;


    boolean isFull(){
        return size == capacity;
    }
    void enqueue(int data){
        if(isFull()){
            System.out.println("Cannot add element as queue is full");
            return;
        }
        rear = (rear+1) % capacity;
        arr[rear] = data;
        size++;
        System.out.println(data + "Element Added");
    }

    boolean isEmpty(){
        return size == 0;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty cannot dequeue");
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


public class queueImplementationUsingArray {
    public static void main(String[] args) {
        
    }
}
