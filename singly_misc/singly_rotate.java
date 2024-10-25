package singly_misc;
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class singly_rotate {

    public static int getLength(Node head){
        int len = 0;
        Node curr = head;
        while (curr != null){
            len++;
            curr = curr.next;
        }
        return len;
    }

    public static Node rotateKNodes(Node head, int k){
        if (k == 0 || head == null){
            return head;
        }
        int len = getLength(head); //length

        k %= len; //get the remainder: suppose k=8; len=5; rotation=3
        if(k==0) //no rotations needed
            return head;

        Node temp=head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = head; //make it circular by pointing the last node to the first node
        
        Node curr = head;
        for(int i = 1; i < k; i++)
            curr = curr.next; //traverse till kth node
        head = curr.next; //make (k+1)th node the head
        curr.next = null; //break the loop 
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
}
public static void main(String[] args) {

    // Create a hard-coded linked list:
    // 10 -> 20 -> 30 -> 40
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    head.next.next.next.next = new Node(50);
    
  
    head = rotateKNodes(head, 8);
    printList(head);
}
}

