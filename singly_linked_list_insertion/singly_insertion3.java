//Insertion before a given Node
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class singly_insertion3 {
    static Node insertBeforeNode (Node head, int key, int newData) {

        if (head == null) //list empty
            return null;
        if (head.data == key) { //if the key is head
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node curr = head;
        Node prev = null;

        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            Node newNode = new Node(newData);
            prev.next = newNode;
            newNode.next = curr;
        }

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

        int newData = 6;
        int key = 2;

        head = insertBeforeNode(head, key, newData);

        printList(head);
    }
}
