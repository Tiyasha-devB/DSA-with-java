//Insertion at the specific position
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class singly_insertion5 {

    static Node insertAtPos(Node head, int pos, int newData) {
        if (head == null)
            return null;

        Node newNode = new Node(newData);
        if (pos == 1){
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node curr = head; //traverse for tracking the pos in curr
        while(curr != null && pos > 1){
            curr=curr.next;
            pos--;
        }
        if(curr == null){ //if curr has reached the null node then pos is out of bounds
        System.out.println("Out of bounds");
        return head;
        }
    
        //else curr!=null
        newNode.next = curr.next;
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
        //1->2->3->4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        int newData = 5;
        int pos = 3;
        head = insertAtPos(head, pos, newData);
        printList(head);
    }
}