//Deletion at beginning
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class singly_deletion1{

    public static Node deleteHeadNode(Node head) {
        if (head == null)
            return null;
        
            @SuppressWarnings("unused")
            Node temp = head;
            head = head.next;
            temp = null;
            return head;
    }

    public static void printList(Node head) {
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(" " + curr.data);
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.println("Before: ");
        printList(head);
        head = deleteHeadNode(head);
        System.out.println("After: ");
        printList(head);
    }
}