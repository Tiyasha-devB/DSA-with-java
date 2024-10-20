package singly_misc;
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class singly_reverse {

    public static Node reversedList(Node head) {
        
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    } 

    
    static void printList(Node head) {
        while (head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked list:");
        printList(head);
        
        Node rev = reversedList(head);

        System.out.print("\nReversed Linked List:");
        printList(rev);
    }
}
