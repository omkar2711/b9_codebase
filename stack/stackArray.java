package stack;

public class stackArray {
    // implementation using array 
    int size;
    int[] arr;
    int top=-1;
    
    public stackArray(int size){
        this.size=size;
        arr=new int[size];
    }

    void push(int element){
        if(top == size-1){
            System.out.println("stack overflow....");
            return;
        }
        top++;
        arr[top]=element;
    }

    int pop(){
        if(top==-1){
            System.out.println("stack underflow....");
            return -1;
        }
         int x=arr[top];
         top--;
         return x;
    }

    int peek(){
       if(!isempty()){
         return arr[top]; 
       }
       else{
        System.out.println("stack is empty");
        return -1;
       }
    }
    
     int size(){
        return top+1;
     }

    boolean isempty(){
        if(top == -1){
            return true;
        }
        return false;
    }

     void display(){
        if(isempty()){
            System.out.println("stack is empty");
            return;
        }
        System.out.print("[");
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print("]");
     }


    public static void main(String[] args) {
        stackArray s=new stackArray(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("top element : "+s.peek());
   
    }
    
}
