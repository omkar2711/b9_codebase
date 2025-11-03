package DSA.LinearDataStructure.LinkedList.singly;

public class MidPointOfList {
    Node head;
    void MidOfList()
    {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow);
    }
}
