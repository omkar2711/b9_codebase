import java.util.Stack;

public class queueImplementationUsingStack {
    public static void main(String[] args) {
        Stack s1 = new Stack<>();
        Stack s2 = new Stack<>();


        s1.push(10);
        System.out.println("Element added is: " + 10);
        s1.push(20);
        System.out.println("Element added is: " + 20);
        s1.push(30);
        System.out.println("Element added is: " + 30);
        s1.push(40);
        System.out.println("Element added is: " + 40);
        s1.push(50);
        System.out.println("Element added is: " + 50);

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        while(!s2.isEmpty()){
            System.out.println("Element dequeue is : " + s2.pop());
        }

    }
}
