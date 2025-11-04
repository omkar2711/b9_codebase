//Implementation of Stack using Array

class Stack1{
    int size = 1001;
    int[] arr = new int[size];
    int top = -1;

    void push(int val){

        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = val;
        System.out.println( val + " added to the stack");
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
            return 0;
        }
        int x = arr[top];
        top--;
        return x;
    }

    int peek(){
        return arr[top];
    }

    boolean isFull(){
        if(top == size){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
}

public class stackImplementation {
    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        System.out.println("Element at top is: " + st.peek());
        st.push(20);
        System.out.println("Element at top is: " + st.peek());
        st.push(30);
        System.out.println("Element pooped is: " + st.pop());
        System.out.println("Element at top is: " + st.peek());
    }
}
