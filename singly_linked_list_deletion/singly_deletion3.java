//Deletion at beginning
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class singly_deletion3{

    public static Node deleteSpecificNode(Node head, int pos) {
        if (head == null)
            return null;
        
        Node temp = head;
        Node prev = null;

        if (pos == 1) {
            head = temp.next;
            return head;
        }
        while (temp != null && pos > 1){
            prev = temp;
            temp = temp.next;
            pos--;
        }
        if(temp != null){
            prev.next = temp.next;
            temp = null;
        }
        else
            System.out.println("Data not Found \n");
        return head;
    }

    public static void printList(Node head) {
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(" " + curr.data);
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original list: ");
        printList(head);
        int position = 2; // Deleting node at position 2
        head = deleteSpecificNode(head, position);
        System.out.print("List after deletion: ");
        printList(head);
    }
}