//Insertion at the end
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class singly_insertion4 {

    static Node insertAtEnd(Node head, int newData) {
        if (head == null)
            return null;

        Node newNode = new Node(newData);
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = newNode;
        return head;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        int newData = 5;

        head = insertAtEnd(head, newData);
        printList(head);
    }
}