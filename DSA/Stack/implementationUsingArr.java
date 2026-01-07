package DSA.Stack;

class Stack{
    int size = 1001;
    int[] arr = new int[size];
    int top = -1;

    boolean isFull(){
        return top == size;
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = val;
        System.out.println(val+" is added to the stack");
    }

    boolean isEmpty(){
        return top == -1;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        int x = arr[top];
        top--;
        return x;
    }

    int peek(){
        return arr[top];
    }

}


public class implementationUsingArr {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(11);
        System.out.println("element at top is "+st.peek());
        st.push(12);
        System.out.println("element at top is  "+st.peek());
        st.push(13);
        System.out.println("element at top is  "+st.peek());
        System.out.println("element is removed "+st.pop());
        System.out.println("Now element at top is: "+st.peek());

    }
}
