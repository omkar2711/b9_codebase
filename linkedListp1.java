
import java.util.LinkedList;


public class linkedListp1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        list.addFirst(10);
        list.addFirst(100);
        list.addFirst(5);
        list.addLast(20);

        list.removeFirst();

        System.out.println(list);
    }
}
