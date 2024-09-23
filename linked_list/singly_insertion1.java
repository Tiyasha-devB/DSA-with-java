
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class singly_insertion1 {
  
    // Function to insert a new node at the beginning of the
    // list
    public static Node insertAtFront(Node head,int new_data) {
      
        // Create a new node with the given data
        Node new_node = new Node(new_data);

        // Make the next of the new node point to the
        // current head
        new_node.next = head;
        head = new_node;

        // Return the new node as the new head of the list
        return new_node;
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

     
        int data = 1;
        head = insertAtFront(head, data);

        printList(head);
    }
}
