package DSA.LinearDataStructure.LinkedList.singly;

public class SinglyLinkedList {
    Node head;
    void insertAtStart(int data) {
        {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }
    void disply() {
            Node cur = head;
            while(cur!=null)
            {
                System.out.print(cur.data+"->");
                cur=cur.next;
            }
        System.out.println("null");
        }
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.insertAtStart(10);
        s1.insertAtStart(20);
        s1.insertAtStart(30);
        s1.disply();
    }
    }

